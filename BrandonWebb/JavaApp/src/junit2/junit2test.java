/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit2;
  import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author brandonmichaelwebb
 */
public class junit2test {

   String message = "Brandon";	
   junit2 junit2 = new junit2(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, junit2.printMessage());     
   }
}