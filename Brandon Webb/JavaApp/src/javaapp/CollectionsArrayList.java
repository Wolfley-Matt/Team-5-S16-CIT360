/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author brandonmichaelwebb
 */
import java.util.*;

public class CollectionsArrayList {
    public static void main (String[] args) {
    System.out.println("ArrayLists can dynamically grow and shrink as per the need."
            + "\nApart from these benefits ArrayList class enables us to use predefined methods of it which makes our task easy. "
            + "\nLet’s see the ArrayList example first then we will discuss it’s methods and their usage.");
    
      /*I'm going to add String elements so I made it of string type */
	  ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  obj.add("Brandon");
	  obj.add("Brenton");
	  obj.add("Brittany");
	  obj.add("Bryson");

	  /* Displaying array list elements */
	  System.out.println("\nCurrently the array list has following elements:"+obj);
          
	  /*Add my parents to the ArrayList*/
	  obj.add(0, "Tammy");
	  obj.add(1, "Don");

	  /*Remove children who are on missions*/
	  obj.remove("Brittany");
	  obj.remove("Bryson");

	  System.out.println("\nCurrent array list is:"+obj);

	  /*Remove element from the given index*/
	  obj.remove(1);

	  System.out.println("\nCurrent array list is:"+obj);
          
          int x = obj.size();
	  System.out.println("\nThe size of the array list is: " + x);
          
          
   }
}
    
    
