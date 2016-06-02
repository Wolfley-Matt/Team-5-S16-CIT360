/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.util.*;
/**
 *
 * @author brandonmichaelwebb
 */
public class CollectionsDemo {
    
    public static void main(String[] args) {
      //ArrayList 
      List a1 = new ArrayList();
      a1.add("Brandon Webb");
      a1.add("Ashlyn Webb");
      a1.add("Jayden Webb");
      System.out.println("ArrayList Elements");
      System.out.println("A list in Java provides ordered and indexed \n"
                       + "collections which may contain duplicates");
      System.out.print("\t" + a1);
      System.out.println();


      //LinkedList
      List l1 = new LinkedList();
      l1.add("Donald Webb");
      l1.add("Tammy Webb");
      l1.add("Bryson Webb");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);
      System.out.println();


      //HashSet
      Set s1 = new HashSet(); 
      s1.add("Russ Walston");
      s1.add("Tiffany Walston");
      s1.add("Tiffany Walston");
      s1.add("Addie Walston");
      System.out.println();
      System.out.println(" Set Elements - With Sets in Java no duplicates elements are allowed");
      System.out.print("\t" + s1);
      System.out.println();


      //HashMap
      Map m1 = new HashMap(); 
      m1.put("Adult", "21");
      m1.put("Minor", "16");
      m1.put("Child", "8");
      m1.put("Grandparent", "50");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      System.out.println();

   }
}


