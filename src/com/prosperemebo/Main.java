package com.prosperemebo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions 2D Array
        String[][] questions = {
                {"What is the capital city of Nigeria?", "A) Lagos", "B) Abuja", "C) Kano", "D) Port Harcourt", "B"},
                {"Who is the current President of Nigeria?", "A) Peter Obi", "B) Muhammadu Buhari", "C) Olusegun Obasanjo", "D) Bola Ahmed Tinibu", "D"},
                {"What is the official language of Nigeria?", "A) Yoruba", "B) Hausa", "C) Igbo", "D) English", "D"},
                {"Which Nigerian musician won the Grammy Award for Best Global Music Album in 2021?", "A) Wizkid", "B) Burna Boy", "C) Davido", "D) Tiwa Savage", "B"},
                {"What is the largest city in Nigeria by population?", "A) Lagos", "B) Kano", "C) Ibadan", "D) Abuja", "A"}
        };

        // Initialise Variables
        int correctAnswers = 0;
        int totalQuestions = questions.length;

        System.out.println("Prosper's Quiz Game!");

        // Loop through questions array
        for (int i = 0; i < totalQuestions; i++) {
            String[] currentQuestion = questions[i];

            // Display questions and it's options
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(currentQuestion[0]);

            // Loop that starts from one and ends before the last one
            for (int j = 1; j < currentQuestion.length - 1; j++) {
                System.out.println(currentQuestion[j]);
            }

            // Using while loop and scanner to read user's input
            char answer = '0';
            do {
                // Display error message if answer changes and loop is still running
                if (answer != '0') {
                    System.out.print(answer + " is not a valid option!\nd");
                }

                System.out.print("Enter answer (A, B, C, or D): ");
                answer = Character.toUpperCase(scanner.next().charAt(0));

                // Keep loop running answer is not A, B, C and D
            } while (answer < 'A' || answer > 'D');

            // If answer is equal to the last item of the array, print correct, else print incorrect with correct option
            if (answer == currentQuestion[currentQuestion.length - 1].charAt(0)) {
                correctAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + currentQuestion[currentQuestion.length - 1].charAt(0) + ".");
            }
        }

        // Calculate score using percentage formular
        double score = ((double) correctAnswers / totalQuestions) * 100;
        System.out.println("\nYour final score is: " + score + "%");

        System.out.println("Thanks for playing, bye...");
    }
}