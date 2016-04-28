/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory.pkg10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author NOI25
 */
public class Server {
    private ServerSocket server;
    private Socket conexiune;
    private Conexiune con;
    
    Server(int port) throws IOException{
            server=new ServerSocket(port);
    }
    
    public void startServer() throws IOException{
        ExecutorService executor = Executors.newFixedThreadPool(7);
        
        while(true){
            conexiune = server.accept();
            con = new Conexiune(conexiune);
            
            executor.execute(con);
        }
    }
    
    public static void main(String[] args) throws IOException{
        Server s = new Server(7777);
        s.startServer();
    }
}
