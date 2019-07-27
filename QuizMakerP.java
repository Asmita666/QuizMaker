package quizmakerp;
import java.util.Scanner;

public class QuizMakerP {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Welcome to Quizmaker. Which quiz would you like to take? The choices are Math, Biology, Chemistry, Physics, and Java:");
       String input = keyboard.nextLine();
       
        switch (input) {
            case "Math":
                System.out.println("This is the math quiz. Don't cheat!");
                int rightAnswers = 0;
                System.out.println("Question 1: What is the Pythagorean Theorom?");
                System.out.println("\tA) a+b ");
                System.out.println("\tB) a+b=c");
                System.out.println("\tC) a^2+b^2=c^2");
                String answer1 = keyboard.nextLine();
                if (answer1.equals("C")) {
                    System.out.println("That is correct!");
                    rightAnswers++;
                }
                else {
                    System.out.println("Sorry, that is incorrect! Onto the next question!");
                }    System.out.println("Question 2: What is the slope formula?");
                System.out.println("\tA) y = mx + b ");
                System.out.println("\tB) y^2-y^1 / x^2-x^1");
                System.out.println("\tC) y = 2x +c");
                String answer2 = keyboard.nextLine();
                if (answer2.equals("B")) {
                    System.out.println("That is correct!");
                    rightAnswers++;
                }
                else {
                    System.out.println("Sorry, that is incorrect! Onto the next question!");
                }    System.out.println("Question 3: Express 71/1000");
                System.out.println("\tA) .71 ");
                System.out.println("\tB) .0071");
                System.out.println("\tC) .071");
                String answer3 = keyboard.nextLine();
                if (answer3.equals("C")) {
                    System.out.println("That is correct!");
                    rightAnswers++;
                }
                else {
                    System.out.println("Sorry, that is incorrect! Onto the next question!");
                }    System.out.println("Question 4: True or False. Complementary angles measure up to 90 degrees");
                String answer4 = keyboard.nextLine();
                if(answer4.equals("True")) {
                    System.out.println("That is correct!");
                    rightAnswers++;
                }
                else {
                    System.out.println("Sorry,that is incorrect! Onto the next question!");
                }    System.out.println("Question 5: True or False. Verticle angles never have equal measure.");
                String answer5 = keyboard.nextLine();
                if(answer5.equals("False")) {
                    System.out.println("That is correct! Congratulations on finishing this test!");
                    rightAnswers++;
                }
                else {
                    System.out.println("Sorry,that is incorrect! You have completed this test!");
                }    System.out.println("Your score is " +" "+ rightAnswers + " out of 5 questions.");
                System.out.println("Would you like to see the answer key for this quiz?");
                String value = keyboard.nextLine();
                if (value.equals("Yes")){
                    System.out.println("\tC");
                    System.out.println("\tB");
                    System.out.println("\tC");
                    System.out.println("\tTrue");
                    System.out.println("\tFalse");
                }
                else {
                    System.out.println("Thank you for taking this quiz. If you would like to take another quiz, please restart.");
                }
                break;
            case "Biology":
                System.out.println("This is the biology quiz. Don't cheat!");
                int rightAnswers1 = 0;
                System.out.println("Question 1: What is the difference between mitosis and meiosis?");
                System.out.println("\tA) Meiosis is used for reproduction and mitosis is used for cell division");
                System.out.println("\tB) Mitosis is used for reproduction and meiosis is used for cell division");
                System.out.println("\tC) Mitosis helps chromosomes.");
                String answer6 = keyboard.nextLine();
                if(answer6.equals("A")) {
                    System.out.println("That is correct!");
                    rightAnswers1++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 2: What type of cell does mitosis produce?");
                System.out.println("\tA) Haploid");
                System.out.println("\tB) Chromosome");
                System.out.println("\tC) Diploid");
                String answer7 = keyboard.nextLine();
                if (answer7.equals("C")) {
                    System.out.println("That is correct!");
                    rightAnswers1++;
                }
                else {
                    System.out.println("Sorry, that is incorrect! Onto the next question!");
                }  System.out.println("Question 3: When does cytokenesis begin?");
                System.out.println("\tA) Anaphase");
                System.out.println("\tB) Prophase");
                System.out.println("\tC) Metaphase");
                String answer8 = keyboard.nextLine();
                if (answer8.equals("A")) {
                    System.out.println("That is correct!");
                    rightAnswers1++;
                }
                else {
                    System.out.println("Sorry, that is incorrect! Onto the next question!");
                }  System.out.println("Question 4: What are the stages of the cell cycle?");
                System.out.println("\tA) G1,G2,G3");
                System.out.println("\tB) G1,M,G2");
                System.out.println("\tC) G1,s,G2");
                String answer9 = keyboard.nextLine();
                if (answer9.equals("C")) {
                    System.out.println("That is correct!");
                    rightAnswers1++;
                }
                else {
                    System.out.println("Sorry, that is incorrect! Onto the next question!");
                }  System.out.println("Question 5: What type of cells contain only one set of chromosomes?");
                System.out.println("\tA) White blood cells");
                System.out.println("\tB) Haploid");
                System.out.println("\tC) Skin cells");
                String answer10 = keyboard.nextLine();
                if (answer10.equals("B")) {
                    System.out.println("That is correct! Congratulations you have completed the test.");
                    rightAnswers1++;
                }
                else {
                    System.out.println("Sorry, that is incorrect! You have completed this test!");
                }  System.out.println("Your score is " +" "+ rightAnswers1 + " out of 5 questions.");
                System.out.println("Would you like to see the answer key for this quiz?");
                String val = keyboard.nextLine();
                if (val.equals("Yes")){
                    System.out.println("\tA");
                    System.out.println("\tC");
                    System.out.println("\tA");
                    System.out.println("\tC");
                    System.out.println("\tB");
                }
                else {
                    System.out.println("Thank you for taking this quiz. If you would like to take another quiz, please restart.");
                }
                break;
            case "Chemistry":
                System.out.println("This is the chemistry quiz. Don't cheat!");
                int rightAnswers2 = 0;
                System.out.println("Question 1: Are two atoms of the same element always identical?");
                System.out.println("\tA) No");
                System.out.println("\tB) Yes");
                System.out.println("\tC) I don't know.");
                String answer11 = keyboard.nextLine();
                if(answer11.equals("A")) {
                    System.out.println("That is correct!");
                    rightAnswers2++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 2: Can water stay liquid below zero degrees celcius?");
                System.out.println("\tA) No");
                System.out.println("\tB) Yes");
                System.out.println("\tC) I don't know.");
                String answer12 = keyboard.nextLine();
                if(answer12.equals("B")) {
                    System.out.println("That is correct!");
                    rightAnswers2++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 3: Why don't metals burn?");
                System.out.println("\tA) They are too dense.");
                System.out.println("\tB) They have an abundant amount of atoms.");
                System.out.println("\tC) They vaporize instead.");
                String answer13 = keyboard.nextLine();
                if(answer13.equals("C")) {
                    System.out.println("That is correct!");
                    rightAnswers2++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 4: What is the formula for sulfuric acid?");
                System.out.println("\tA) H2SO4");
                System.out.println("\tB) HSO");
                System.out.println("\tC) H2O");
                String answer14 = keyboard.nextLine();
                if(answer14.equals("A")) {
                    System.out.println("That is correct!");
                    rightAnswers2++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 5: What is the definition of an acid?");
                System.out.println("\tA) Proton acceptor");
                System.out.println("\tB) Proton donor");
                System.out.println("\tC) Electron donor");
                String answer15 = keyboard.nextLine();
                if(answer15.equals("B")) {
                    System.out.println("That is correct! Congratulations you have completed the test.");
                    rightAnswers2++;
                }
                else {
                    System.out.println("Sorry that is incorrect!You have completed this test!");
                }  System.out.println("Your score is " +" "+ rightAnswers2 + " out of 5 questions.");
                System.out.println("Would you like to see the answer key for this quiz?");
                String valu = keyboard.nextLine();
                if (valu.equals("Yes")){
                    System.out.println("\tA");
                    System.out.println("\tB");
                    System.out.println("\tC");
                    System.out.println("\tA");
                    System.out.println("\tB");
                }
                else {
                    System.out.println("Thank you for taking this quiz. If you would like to take another quiz, please restart.");
                }
                break;
            case "Physics":
                System.out.println("This is the physics quiz. Don't cheat!");
                int rightAnswers3 = 0;
                System.out.println("Question 1: What is Newton's First Law?");
                System.out.println("\tA) F=ma");
                System.out.println("\tB) An object in motion stays in motion unless acted upon by an unbalanced force.");
                System.out.println("\tC) Every action has an equal or opposite reaction. ");
                String answer16 = keyboard.nextLine();
                if(answer16.equals("B")) {
                    System.out.println("That is correct!");
                    rightAnswers3++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 2: True or False. Mass is always conserved.");
                String answer17 = keyboard.nextLine();
                if(answer17.equals("True")) {
                    System.out.println("That is correct!");
                    rightAnswers3++;
                }
                else {
                    System.out.println("Sorry,that is incorrect! Onto the next question!");
                }  System.out.println("Question 3: True or False.The acceleration of gravity is 9.8m/s^2.");
                String answer18 = keyboard.nextLine();
                if(answer18.equals("True")) {
                    System.out.println("That is correct!");
                    rightAnswers3++;
                }
                else {
                    System.out.println("Sorry,that is incorrect! Onto the next question!");
                }  System.out.println("Question 4: What is formula for speed?");
                System.out.println("\tA) s = dt");
                System.out.println("\tB) s = d + t");
                System.out.println("\tC) s = d/t ");
                String answer19 = keyboard.nextLine();
                if(answer19.equals("C")) {
                    System.out.println("That is correct!");
                    rightAnswers3++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 5: What is the speed of light?");
                System.out.println("\tA) 3 * 10^8 m/s");
                System.out.println("\tB) 3 * 8^10 m/s");
                System.out.println("\tC) 72mph ");
                String answer20 = keyboard.nextLine();
                if(answer20.equals("A")) {
                    System.out.println("That is correct!Congratulations you have completed the test.");
                    rightAnswers3++;
                }
                else {
                    System.out.println("Sorry that is incorrect!You have completed this test! ");
                }  System.out.println("Your score is " +" "+ rightAnswers3 + " out of 5 questions.");
                System.out.println("Would you like to see the answer key for this quiz?");
                String va = keyboard.nextLine();
                if (va.equals("Yes")){
                    System.out.println("\tA");
                    System.out.println("\tTrue");
                    System.out.println("\tTrue");
                    System.out.println("\tC");
                    System.out.println("\tA");
                }
                else {
                    System.out.println("Thank you for taking this quiz. If you would like to take another quiz, please restart.");
                }
                break;
            case "Java":
                System.out.println("This is the Java quiz. Don't cheat!");
                int rightAnswers4 = 0;
                System.out.println("Question 1: True or False.Boolean means true or false.");
                String answer21 = keyboard.nextLine();
                if(answer21.equals("True")) {
                    System.out.println("That is correct!");
                    rightAnswers4++;
                }
                else {
                    System.out.println("Sorry,that is incorrect! Onto the next question!");
                }  System.out.println("Question 2: What is Java?");
                System.out.println("\tA) It is a programming language.");
                System.out.println("\tB) It is an IDE. ");
                System.out.println("\tC) It is coffee.");
                String answer22 = keyboard.nextLine();
                if(answer22.equals("A")) {
                    System.out.println("That is correct!");
                    rightAnswers4++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 3: What does OOP stand for?");
                System.out.println("\tA) Object");
                System.out.println("\tB) Object On Program");
                System.out.println("\tC) Object Oriented Programming.");
                String answer23 = keyboard.nextLine();
                if(answer23.equals("C")) {
                    System.out.println("That is correct!");
                    rightAnswers4++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 4: What are the different types fo variables?");
                System.out.println("\tA) String, Boolean, Double ");
                System.out.println("\tB) Int, Double, String, Boolean");
                System.out.println("\tC) String, Int , Double");
                String answer24 = keyboard.nextLine();
                if(answer24.equals("B")) {
                    System.out.println("That is correct!");
                    rightAnswers4++;
                }
                else {
                    System.out.println("Sorry that is incorrect! Onto the next question");
                }  System.out.println("Question 5: What is a class?");
                System.out.println("\tA) Another name for an object. ");
                System.out.println("\tB) A variable.");
                System.out.println("\tC) A template for an object.");
                String answer25 = keyboard.nextLine();
                if(answer25.equals("C")) {
                    System.out.println("That is correct!Congratulations you have completed the test.");
                    rightAnswers4++;
                }
                else {
                    System.out.println("Sorry that is incorrect! You have finished this test.");
                }  System.out.println("Your score is " +" "+ rightAnswers4 + " out of 5 questions.");
                System.out.println("Would you like to see the answer key for this quiz?");
                String v = keyboard.nextLine();
                if (v.equals("Yes")){
                    System.out.println("\tTrue");
                    System.out.println("\tA");
                    System.out.println("\tC");
                    System.out.println("\tB");
                    System.out.println("\tC");
                }
                else {
                    System.out.println("Thank you for taking this quiz. If you would like to take another quiz, please restart.");
                }
                break;
            default:
                break;
        }
           }
}

