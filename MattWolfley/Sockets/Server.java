package servertest;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws Exception {
        //local variables
        String clientInput;
        String lowercase;
        //new socket reception
        ServerSocket welcomeSocket = new ServerSocket(6789);
        //while loop to process any client requests
        while(true) {
            //while socket reuqest exists
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            //get client input from socket
            clientInput = inFromClient.readLine();
            //actual method to make all letters lowercase
            lowercase = clientInput.toLowerCase() + '\n';
            //sent lowercase back to client
            outToClient.writeBytes(lowercase);
        }
    }
}
