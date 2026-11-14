import java.util.Random;
import java.util.Scanner;

/**
 * Math Challenge - CC102 Final Performance Task
 * A simple console game: answer 5 random math questions and get a score.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int totalQuestions = 5;
        int score = 0;

        System.out.println("=== MATH CHALLENGE ===");
        System.out.println("Answer " + totalQuestions + " questions!\n");

        for (int i = 1; i <= totalQuestions; i++) {
            // Pick two random numbers from 1 to 10
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;

            // Pick a random operation: 0 = add, 1 = subtract, 2 = multiply
            int operation = random.nextInt(3);
            int correct;
            String symbol;

            if (operation == 0) {
                correct = a + b;
                symbol = "+";
            } else if (operation == 1) {
                // Put the bigger number first so the answer is never negative
                if (a < b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                correct = a - b;
                symbol = "-";
            } else {
                correct = a * b;
                symbol = "x";
            }

            // Ask the question
            System.out.print("Question " + i + ": " + a + " " + symbol + " " + b + " = ");
            int answer = input.nextInt();

            // Check the answer
            if (answer == correct) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The answer is " + correct);
            }
        }

        // Show the final score
        System.out.println("\nYour score: " + score + " out of " + totalQuestions);

        if (score == totalQuestions) {
            System.out.println("Perfect! You are a math genius!");
        } else if (score >= 3) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep practicing!");
        }

        input.close();
    }
}
