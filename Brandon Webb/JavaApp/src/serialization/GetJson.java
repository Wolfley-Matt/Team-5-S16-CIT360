/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import org.json.CDL;

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
    /*Can't get the JSON Parser to work correctly
    
    JsonParser jp = new JsonParser();
    JsonElement root = jp.prase(new InputStreamReader((InputStream) request.getContent()));
    JsonObject rootojb = root.getAsJsonObject();
    ip = rootobj.get('ip").getAsString();
    System.out.println(ip);
            */
}
}
