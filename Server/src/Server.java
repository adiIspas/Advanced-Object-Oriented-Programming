import java.io.*;
import java.net.*;

public class Server implements Runnable{
	private ServerSocket server;
	private Socket conexiune;
	Server(int port) throws IOException
	{
		server=new ServerSocket(port);
	}
        @Override
	public void run()
	{
		while(true)
		{
			try 
			{	
				conexiune=server.accept();
				Conexiune c= new Conexiune(conexiune);
				Thread t=new Thread(c);
				t.start();
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
        
        public static void main(String[] args) throws IOException{

            Server sv = new Server(7778);
            sv.run();
            
            
        }
}