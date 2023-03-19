package com.jessicapetrey.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jessicapetrey.bookclub.models.LoginUser;
import com.jessicapetrey.bookclub.models.User;
import com.jessicapetrey.bookclub.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

//	get one user by id
	public User getOne(Long id) {
		Optional<User> user = userRepo.findById(id);
		return user.isPresent() ? user.get() : null;
	}

//	get one user by email
	public User getOne(String email) {
		Optional<User> user = userRepo.findByEmail(email);
		return user.isPresent() ? user.get() : null;
	}

//	*********** REGISTER

	// This method will be called from the controller
	// whenever a user submits a registration form.
	public User register(User newUser, BindingResult result) {
		if (result.hasErrors()) {
			return null;
		}
		// Reject if email is taken (present in database)
		User user = getOne(newUser.getEmail());
		if (user != null) {
			result.rejectValue("email", "Unique", "Email is already taken");
			return null;
		}
		// Reject if password doesn't match confirmation
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password", "Match", "Passwords don't match");
			return null;
		}

		// Hash and set password, save user to database
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userRepo.save(newUser);

	}

	// *************** LOGIN

	// This method will be called from the controller
	// whenever a user submits a login form.
	public User login(LoginUser loginUser, BindingResult result) {
		// Return null if result has errors
		if (result.hasErrors()) {
			return null;
		}

		// Find user in the DB by email
		// Reject if NOT present
		User user = getOne(loginUser.getEmail());
		if (user == null) {
			result.rejectValue("email", "Unique", "Invalid email or password");
			return null;
		}

		// Reject if BCrypt password match fails
		if (!BCrypt.checkpw(loginUser.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Match", "Invalid email or password");
			return null;
		}
		// Otherwise, return the user object
		return user;
	}

}
