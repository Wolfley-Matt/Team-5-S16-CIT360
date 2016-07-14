package Client;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String argv[]) throws Exception {
        //take input
        String input;
        String lowercaseoutput;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        //Open connection to server
        try ( 
                Socket clientSocket = new Socket("localhost", 6789)) {
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //accept string input and send to server in socket
            input = inFromUser.readLine();
            outToServer.writeBytes(input + '\n');
            //return string and output
            lowercaseoutput = inFromServer.readLine();
            System.out.println(lowercaseoutput);
        }
    }
}
