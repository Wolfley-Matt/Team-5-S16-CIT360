/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientServerSockets;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
/**
 *
 * @author brandonmichaelwebb
 */
public class Server {

  public static void main(String[] args) throws IOException {
    ServerSocket listener = new ServerSocket(9090);
    try {
      while (true) {
        Socket socket = listener.accept();
        try {
          PrintWriter out =
            new PrintWriter(socket.getOutputStream(), true);
          out.println(new Date().toString());
        } finally {
          socket.close();
        }
      }
    } finally {
      listener.close();
    }
  }
}  

