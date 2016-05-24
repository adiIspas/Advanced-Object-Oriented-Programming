/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket_1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Curs 6
 * @author Adrian ISPAS
 */
public class Client {
    public static void main(String[] args) throws IOException{
        
        int port = 0;
        String adresa = "";
        String mesaj = "";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Port Server: ");
        port = input.nextInt();
        System.out.print("Adresa Server: ");
        adresa = input.next();
        
        Socket socket = new Socket(adresa,port);
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        
        while(true){
            System.out.print("Mesaj pentru server: ");
            mesaj = input.next();
            mesaj += input.nextLine();
            outputStream.writeUTF(mesaj);
        }
    }
}
