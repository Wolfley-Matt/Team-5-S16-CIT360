package javaapp;

public class MyFirstJavaProgram {

   /* This is my first java program.  
    * This will print 'Hello World' as the output
    */
	
    public static void main(String []args) {
       System.out.println("Hello World"); // prints Hello World
       int x = 3;
       String name = "Brandon";
       x = x * 17;
       System.out.print("x is " + x);
       double d = Math.random();
       // This is a comment
       
       System.out.println(x);
       //javaapp.FreshJuiceTest.main(args); This runs the juice program
       //javaapp.BeerSong.main(args); This runs the Beer program
       //javaapp.CollectionsDemo.main(args); This runs the Collections Demo
       javaapp.Serialization.main(args);
      
    }
    

    
} 
