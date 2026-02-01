import java.util.Random;
import java.util.Scanner;

public class ArithmeticApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int totalQuestions = 10;
        int score = 0;

        // record start time
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= totalQuestions; i++) {

            // generate two random numbers (ensure no negative result)
            int num1 = random.nextInt(50) + 1; // 1 - 50
            int num2 = random.nextInt(50) + 1;

            if (num2 > num1) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            boolean correct = false;

            // user gets 2 attempts
            for (int attempt = 1; attempt <= 2; attempt++) {

                System.out.print("Question " + i + 
                                 " (Attempt " + attempt + "): " +
                                 num1 + " - " + num2 + " = ");

                int answer = input.nextInt();

                if (answer == (num1 - num2)) {
                    System.out.println("Correct!\n");
                    score++;
                    correct = true;
                    break;
                } else {
                    System.out.println("Wrong answer.");
                }
            }

            if (!correct) {
                System.out.println("Correct answer is: " + (num1 - num2) + "\n");
            }
        }

        // record end time
        long endTime = System.currentTimeMillis();

        // calculate total time in seconds
        double timeTaken = (endTime - startTime) / 1000.0;

        // display final result
        System.out.println("===== QUIZ RESULT =====");
        System.out.println("Score: " + score + " / " + totalQuestions);
        System.out.println("Time taken: " + timeTaken + " seconds");

        input.close();
    }
}
