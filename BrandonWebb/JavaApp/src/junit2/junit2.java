/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit2;

/**
 *
 * @author brandonmichaelwebb
 */


public class junit2 {

   private String message;

   //Constructor
   //@param message to be printed
   public junit2(String message){
      this.message = message; 
   }

   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
}  	
