package servertest;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws Exception {
        String clientSentence;
        String lowercaseSentence;
        ServerSocket welcomeSocket = new ServerSocket(6789);

        while(true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = inFromClient.readLine();
            lowercaseSentence = clientSentence.toLowerCase() + '\n';
            outToClient.writeBytes(lowercaseSentence);
        }
    }
}
