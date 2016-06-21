
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author brandonmichaelwebb
 */
public class JSONSerialization {
    
    public static void main (String[] args) {
        
        // Object Declaration
        ice_cream_serialization flavor1 = new ice_cream_serialization();
        ice_cream_serialization flavor2 = new ice_cream_serialization();
        
        // Declare IceCream 1 Values
        flavor1.setFlavor("Vanilla");
        flavor1.setColor("Yellow");
        flavor1.setCost(3);
        flavor1.setSize("Large");
        
        // Declare IceCream 2 Values
        flavor2.setFlavor("Chocolate");
        flavor2.setColor("Brown");
        flavor2.setCost(2);
        flavor2.setSize("Medium");
        
        // Display IceCream Values
        System.out.println("IceCream 1");
        flavor1.displayIceCream();
        System.out.println("\n");
        System.out.println("IceCream 2");
        flavor2.displayIceCream();
        
        // Create Google GSON Object
        Gson icecreamJSON = new Gson();
        String data1, data2;
        
        // Serialize IceCreams to JSON
        data1 = icecreamJSON.toJson(flavor1);
        data2 = icecreamJSON.toJson(flavor2);
        
        // Display JSON
        System.out.println("\n\nJSON Serialization of IceCream Data");
        System.out.println(data1);
        System.out.println(data2);
        
        // Save Serialized Data to File
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("savedfile.json"))) {
            bw.write(data1);
            bw.newLine();
            bw.write(data2);
            bw.close();
        } catch (Throwable te) {
            System.out.println("\nException: " + te.toString());
        } 
        
        // Retrieve Serialized Data from File
        String newData1 = new String();
        String newData2 = new String();
        try (BufferedReader br = new BufferedReader(new FileReader("savedfile.json"))) {
            newData1 = br.readLine();
            newData2 = br.readLine();
        } catch (Throwable te) {
            System.out.println("\nException: " + te.toString());
        }
        
        // Display JSON
        System.out.println("\n\nJSON Serialized data retrieve from file");
        System.out.println(newData1);
        System.out.println(newData2);
        
        // Deserialize IceCreams
        ice_cream_serialization newIceCream1 = icecreamJSON.fromJson(newData1, ice_cream_serialization.class);
        ice_cream_serialization newIceCream2 = icecreamJSON.fromJson(newData2, ice_cream_serialization.class);
        
        // Display IceCream Values
        System.out.println("\n");
        System.out.println("New IceCream 1");
        newIceCream1.displayIceCream();
        System.out.println("\n");
        System.out.println("New IceCream 2");
        newIceCream2.displayIceCream();
    }
}

    

