package laboratory.pkg10;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexiune implements Runnable {
    
static void print(InputStream is) throws IOException{
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		
		System.out.println(line);
	}    
    
	private Socket conexiune;
	Conexiune( Socket con)
	{
		this.conexiune=con;
	}
	public void run()
	{
            while(true){
                try {
                    print(conexiune.getInputStream());
                } catch (IOException ex) {
                    Logger.getLogger(Conexiune.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
		/*OutputStream output;
		try {
			output = conexiune.getOutputStream();
			output.write(("HTTP\1.1 200 OK\n\n Salut,bre").getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}