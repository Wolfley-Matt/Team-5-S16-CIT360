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

import java.util.HashSet;

public class CollectionsHashSet {
   
    public static void main (String[] args) {
    System.out.println("This class implements the Set interface, backed by a hash table (actually a HashMap instance). "
            + "\nIt makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time."
            + "\nThis class permits the null element. This class is not synchronized."
            + "\nHowever it can be synchronized explicitly like this: Set s = Collections.synchronizedSet(new HashSet(...));");

    System.out.println("\nThis would be good for implementing randomization for questions banks or making sure duplicates don't exist.");
   
     // HashSet declaration
      HashSet<String> hset = 
               new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Cake Batter");
      hset.add("Chocolate");
      hset.add("Mint");
      hset.add("Strawberry");
      hset.add("French Vanilla");
      hset.add("Coffee");
      hset.add("Cheesecake");
      hset.add("Cotton Candy");
      hset.add("Lemon Sorbet");
      hset.add("Raspberry Sorbet");
      hset.add("Pistachio");
      hset.add("Oatmeal Cookie Batter");
      hset.add("Sweet Cream");
      hset.add("Salted Caramel");
      //Addition of duplicate elements
      hset.add("Cake Bater");
      hset.add("Chocolate");
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      System.out.println("\n"+hset);
    
    
    }
}
