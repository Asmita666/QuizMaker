
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it as many times as you like:" );
       String input = keyboard.nextLine();
       System.out.println("How many times would you like it to repeat?:");
       int answer = keyboard.nextInt();
       
       
       System.out.println("Here we go!");
       int count = 0;
       int number =1;
       while (count < answer) {
           System.out.println( number + "." + input);
           count ++;
           number ++;
    
            }
       }
    }
    

