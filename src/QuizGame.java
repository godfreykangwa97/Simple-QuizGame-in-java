import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQuestions = 5; // Total number of questions
        int correctAnswers = 0; // Initialize correct answers count

        // Questions and their corresponding correct answers
        String[] questions = {
                "What is a correct syntax to output \"Hello World\" in Java?",
                "Java is short for \"Javascript\". (true/false)",
                "How do you insert COMMENTS in Java code?",
                "Which data type is used to create a variable that should store text?",
                "How do you create a variable with the numeric value 5?"
        };

        String[] answers = {"C", "B", "B", "A", "D"};

        // Display questions and get user input
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println("A. echo (\"Hello World\")");
            System.out.println("B. Console.WriteLine (\"Hello World\")");
            System.out.println("C. System.out.println (\"Hello World\")");
            System.out.println("D. print (\"Hello World\")");
            System.out.print("Enter your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            // Compare user answer with correct answer
            if (userAnswer.equals(answers[i])) {
                correctAnswers++;
            }
        }

        // Calculate and display the final score
        double score = (double) correctAnswers / totalQuestions * 100;
        System.out.println("\nYour score: " + score + "%");
    }
}
