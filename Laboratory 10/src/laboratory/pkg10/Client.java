/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory.pkg10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 *
 * @author NOI25
 */
public class Client implements Runnable{
    
    String host;
    int port;
    String id;
    Socket conexiune;
    
    Client(String host, int port, String id){
        this.host = host;
        this.port = port;
        this.id = id;
    };

    @Override
    public void run() {
        try {
            conexiune = new Socket(host, port);
            
            while(true){
                DataOutputStream dos = new DataOutputStream(conexiune.getOutputStream());
                dos.writeBytes(id + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args){
        //IntStream.range(0, 6).forEach(i->new Thread(new Client("localhost",7777,"Client " + i)));
        for(int i = 0; i < 5; i++){
            Client c = new Client("localhost",7777,"Client " + i);
            (new Thread(c)).start();
        }
    }
}
