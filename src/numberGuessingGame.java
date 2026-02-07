import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {

        System.out.println("I'm thinking of a number between 1-10. Guess it and win a prize!! (reyal) ");
        System.out.println("Input your answer:");

        // objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // variables
        int keyboardInput = scanner.nextInt();
        int randomNum = random.nextInt(10) + 1;


        if (keyboardInput == randomNum) {
           System.out.println("You guessed it correctly!! You win 1 bag of eyeballs yippie!! ");
        } else
            System.out.println("womp womp try again");


    }

}
