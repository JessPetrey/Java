import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    // create method that gets ten 'rolls' of random ints between 1 and 20
    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();  //new instance of Random
        ArrayList<Integer> tenRolls = new ArrayList<Integer>(); // creates an instance of arraylist type integer, called tenRolls
        while (tenRolls.size() < 10){ //while the array list called tenRolls contains less than 10 integers
            tenRolls.add(randMachine.nextInt(1, 21)); // add a new random int
        }
        return tenRolls; // returns the array containing ten random integers
    }

    public String getRandomLetter() {
        Random randMachine = new Random();
        int randomIndex = randMachine.nextInt(25);

        ArrayList<String> alphabet = new ArrayList<String>();
        for (int i = 'A'; i<= 'Z'; i++){  //ascii chars
            char letter = (char) i;
            alphabet.add(String.valueOf(letter));
        }
        return alphabet.get(randomIndex);
    }

    public String generatePassword(){
        String password = "";
        while(password.length() < 8){
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int stringLength) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        while(passwordSet.size() < stringLength){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}