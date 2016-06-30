/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

/**
 *
 * @author brandonmichaelwebb
 */

import java.net.HttpURLConnection;
import java.net.*;
import java.io.*;


public class httpurlconnection {
    public static void main(String[] args)  {
        
        String output = getUrlContents("http://google.com/");
        System.out.println(output);
    }
    
    private static String getUrlContents(String theUrl) {
        
        StringBuilder content = new StringBuilder();
        
        try {
            
            URL url = new URL(theUrl);
            
            URLConnection urlConnection = url.openConnection();
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            
            bufferedReader.close();
        }
        catch(Exception e) {
            
           e.printStackTrace();
            
        }
        return content.toString();
    }
}
    
        

