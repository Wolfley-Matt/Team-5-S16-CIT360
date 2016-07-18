/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientServerSockets2;
import java.net.*;
import java.io.*;

/**
 *
 * @author brandonmichaelwebb
 */
public class Communicate {
    // File Name GreetingClient.java
   public static void main(String [] args)
   {
      String serverName = args[0];
      int port = Integer.parseInt(args[1]);
      try
      {
         System.out.println("Connecting to " + serverName +
		 " on port " + port);
         Socket client = new Socket(serverName, port);
         System.out.println("Just connected to " //Lets us know when we have a connection
		 + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         out.writeUTF("Hello from "
                      + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in =
                        new DataInputStream(inFromServer); //Grabs the information from the server
         System.out.println("Server says " + in.readUTF()); //This is hte output from the server
         client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}

