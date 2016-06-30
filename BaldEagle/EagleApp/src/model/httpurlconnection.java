/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



/**
 *
 * @author Rachel 
 */
public class httpurlconnection {
    public static void main(String[] args) throws MalformedURLException, IOException
    //Created a Java URL object
    {
    String urltext = "http://animals.nationalgeographic.com/animals/birds/bald-eagle/";
    URL url = new URL(urltext);
    int responseCode = ((HttpURLConnection) url.openConnection()).getResponseCode();
    if (responseCode == 200 )
    {
        System.out.println(responseCode + " " + urltext);
    }
    else {
        System.out.println("Cannot connect");
    }      
    }

}
