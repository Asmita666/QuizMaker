/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doubles;

import java.util.Random;
import java.util.Scanner;
 //*
// * @author Education Unlimited
 //*/
public class HighOrLow {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Random rand = new Random(); 
     int value = rand.nextInt(100);
     int input = -1;
     
     while(value != input) {
         System.out.println("Guess a number between 1 and 100: ");
     
         input = scanner.nextInt();
          
         if( input < value){
         System.out.println("your guess is too low");
           }
         else if(input > value) {
         System.out.println("your guess is too high");
           }
         else {
         System.out.println("congrats!");
          }
     
       
     }
}
}