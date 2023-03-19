package com.jessicapetrey.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Size(min = 2, max = 40, message = "Title should be betwwen 2 and 40 characters")
	@NotEmpty(message = "Book title should not be empty")
	private String title;
	@Size(min = 2, max = 40, message = "Author name should be betwwen 2 and 40 characters")
	@NotEmpty(message = "Please provide the Author name")
	private String author;
	@Size(min = 5, max = 200, message = "Description should be betwwen 5 and 200 characters")
	@NotEmpty(message = "Description should not be empty")
	private String description;
	
//	MANY BOOKS TO ONE USER
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User postedBy;

	@Column(updatable = false)
	private Date createdAt;

	private Date updatedAt;

// constructors
	public Book() {

	}

	public Book(String title, String description, String author) {
		this.title = title;
		this.description = description;
		this.author = author;

	}

	public Book(Long id, String title, String description, String author) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
	}

// get and set
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}


}
