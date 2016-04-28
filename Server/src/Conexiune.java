import java.io.*;
import java.net.*;

public class Conexiune implements Runnable {
	private Socket conexiune;
	Conexiune( Socket con)
	{
		this.conexiune=con;
	}
	public void run()
	{
		OutputStream output;
		try {
			output = conexiune.getOutputStream();
			output.write(("HTTP\1.1 200 OK\n\n Salut,bre").getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}