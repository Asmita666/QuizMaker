
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        System.out.println("Question 2: Which is NOT a programming language?");
        System.out.println("\tA) HTML");
        System.out.println("\tB) Java");
        System.out.println("\tC) Python");
        System.out.println("\tD) Rattlesnake");
        String answer2 = keyboard.nextLine();
             if (answer2.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer is Rattlesnake!");
        }
        System.out.println("Question 3: Which symbol means greater than?");
        System.out.println("\tA) >");
        System.out.println("\tB) <");
        System.out.println("\tC) <=");
        System.out.println("\tD) >=");
        String answer3 = keyboard.nextLine();
             if (answer3.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer is >!");
        }
        System.out.println("Question 4: Which subject is the study of living organisms?");
        System.out.println("\tA) chemistry");
        System.out.println("\tB) physics");
        System.out.println("\tC) biology");
        System.out.println("\tD) geography");
        String answer4 = keyboard.nextLine();
             if (answer4.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer is biology!");
        }
        System.out.println("Question 5: True or False. Stanford University is located in California.");
        String answer5 = keyboard.nextLine();
             if(answer5.equals("True")) {
                 System.out.println("That is correct!");
            rightAnswers++;
             }
             else {
            System.out.println("Sorry, the correct answer is True!");
        }
        System.out.println("Question 5: True or False.Banana is a fruit.");
        String answer6 = keyboard.nextLine();
             if(answer6.equals("True")) {
                 System.out.println("That is correct!");
            rightAnswers++;
             }
             else {
            System.out.println("Sorry, the correct answer is True!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
    }
    
}
