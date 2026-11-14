import java.util.Random;
import java.util.Scanner;

public class MathChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int totalQuestions = 5;
        int score = 0;

        System.out.println("=== MATH CHALLENGE ===");
        System.out.println("Answer " + totalQuestions + " questions!\n");

        for (int i = 1; i <= totalQuestions; i++) {
            
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;

            
            int operation = random.nextInt(3);
            int correct;
            String symbol;

            if (operation == 0) {
                correct = a + b;
                symbol = "+";
            } else if (operation == 1) {
                
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

            
            System.out.print("Question " + i + ": " + a + " " + symbol + " " + b + " = ");
            int answer = input.nextInt();

            
            if (answer == correct) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The answer is " + correct);
            }
        }

        
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
