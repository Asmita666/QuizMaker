/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doubles;

import java.util.Random;


public class Doubles {
     public static void main(String [] args) {
     Random rand = new Random(); 
     int value = rand.nextInt(6);
     Random rando = new Random();
     int val = rando.nextInt(6);
     
       while(value != val){
          System.out.println(value);
          System.out.println(val);
       } 
      System.out.println("congratulations!");
     }
     
}  
/**
 *
 * @author Education Unlimited
 */

