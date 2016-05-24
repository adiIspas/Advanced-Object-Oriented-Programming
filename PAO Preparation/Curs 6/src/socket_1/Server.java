/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket_1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Curs 6
 * @author Adrian ISPAS
 */
public class Server {
    public static void main(String[] args) throws IOException{
        
        int port = 0;
        Scanner inputPort = new Scanner(System.in);
        
        System.out.print("Port Server: ");
        port = inputPort.nextInt();
        
        ServerSocket server = new ServerSocket(port);

            Socket socket = server.accept();
            System.out.println("Client nou");
            
            InputStream in = socket.getInputStream();
            
            while(in != null){
                DataInputStream inputStream = new DataInputStream(in);
                in = socket.getInputStream();
                System.out.println("Mesaj: " + inputStream.readUTF());
            }
    }
}
