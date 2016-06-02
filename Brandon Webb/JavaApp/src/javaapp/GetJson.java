/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.io.IOException;
import java.net.*;

/**
 *
 * @author brandonmichaelwebb
 */
public class GetJson {
    

    public void GetJson () throws IOException {
    String ip;
    String sURL = "http://jsonip.com";
    
    //connect to URL using java
    URL url = new URL(sURL);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.connect();
    
}
}
