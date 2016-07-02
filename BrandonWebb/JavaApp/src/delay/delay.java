/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delay;

/**
 *
 * @author brandonmichaelwebb
 */
public class delay {
     public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException exp) {
		}

	}
}
