import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        System.out.println("\n----- Get Ten Rolls Test -----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("\n----- Get Random Letter Test -----");
        System.out.println(generator.getRandomLetter());

        System.out.println("\n----- Generate Password Test -----");
        System.out.println(generator.generatePassword());

        System.out.println("\n----- Get Password Set Test -----");
        System.out.println(generator.getNewPasswordSet(4));

    }

}