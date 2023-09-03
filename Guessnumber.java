import java.util.Scanner;
import java.util.Random;

public class Guessnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean play = true;
        int finalScore = 0;

        while (play) {
            int Min = 1;
            int max = 100;

            Random ran = new Random();

            int rnumb = ran.nextInt(max - Min + 1) + Min;

            int TotalAttempt = 5;
            int attempt = 0;

            while (attempt < TotalAttempt) {
                System.out.print("Guess the number between " + Min + " , " + max + " : ");
                int userinput =sc.nextInt();

                attempt++;

                if (userinput == rnumb) {
                    System.out.println("Your guess is correct.");
                    finalScore++; 
                    break; 
                } else if (userinput < rnumb) {
                    System.out.println("Wrong Answer, your guess is too low.");
                } else {
                    System.out.println("Wrong Answer, your guess is too high.");
                }

                if (attempt < TotalAttempt) {
                    System.out.println("You have " + (TotalAttempt - attempt) + " attempt(s) remaining.");
                } else {
                    System.out.println("You have no more attempts. The correct number was: " + rnumb);
                }
            }

            System.out.print("You want to play again? (yes/no): ");
            String input = sc.next();
            play = input.equalsIgnoreCase("yes");
        }

        System.out.println("Your total score: " + finalScore);

    }
}
