package controller;

import ClientServerSockets.Client;
import collections.CollectionsArrayList;
import collections.CollectionsDemo;
import collections.CollectionsHashSet;
import java.io.IOException;
import java.util.Scanner;
import learning_code.BeerSong;
import learning_code.FreshJuiceTest;
import serialization.JSONSerialization;

public class MyFirstJavaProgram {

   /* This is my first java program.  
    * This will print 'Hello World' as the output
    */
	
    public static void main(String []args) throws IOException {
       System.out.println("Hello World, please choose an option for what you would like to do\n"); // prints Hello World
       
       
       System.out.println("The following are the different classes within my program");
       System.out.println("I basically want to make a page that shows each one");
       System.out.println("What would you like to see?\n");
       System.out.println("1. FreshJuiceTest\n"
                        + "2. Beer Song\n"
                        + "3. Collections Demo\n"
                        + "4. JSONSerialization\n"
                        + "5. CollectionsArrayList\n"
                        + "6. CollectionsHashSet\n"
                        + "7. Under Construction\n"
                        + "8. HTTPUrlConnection\n"
                        + "9. Threads, Executables, Runnables\n"
                        + "10. Under Construction\n"
                        + "11. Client/Server Sockets");
       Scanner scanner_1 = new Scanner(System.in);
       int choice;
       do {
           while(!scanner_1.hasNextInt()) {
               System.out.println("Please enter valid data");
               scanner_1.next();
           }
           choice = scanner_1.nextInt();
       } while (choice <= 0);
       switch (choice) {
           case 1:
               FreshJuiceTest.main(args);
               break;
           case 2:
               BeerSong.main(args);
               break;
           case 3:
               CollectionsDemo.main(args);
               break;
           case 4:
               JSONSerialization.main(args);
               break;
           case 5:
               CollectionsArrayList.main(args);
               break;
           case 6: 
                CollectionsHashSet.main(args);
                break;
           case 7:
               
               //System.out.println(IceCream.getFlavor());
               break;
           case 8:
               System.out.println("Please enter a website you would like to test");
               Scanner scanner_2 = new Scanner(System.in);
               String input = ("http://") + scanner_2.nextLine();
               System.out.println(input);
               //httpurlconnection.httpurlconnection.connection("http://thewebbspot.com");
               httpurlconnection.httpurlconnection.connection(input);
               
               break;
           case 9:
                ThreadsExecutorsRunnables.threadsExecutorsRunnables.main(args);
               break;
           case 10:
               //JUnit.junit.class;
               break;
           case 11:
               Client.main(args);
               break;
               

               
               
               
               
            
       
       
       }
    }
    
   

    
    

    
} 
