import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.DataOutputStream;

public class Client {
	
	static void print(InputStream is) throws IOException{
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		
		System.out.println(line);
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		final int PORT = 6671; 
		
		Socket cs = new Socket("localhost",PORT);
		DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
		for(int i = 0; i < 5; i++){
			dos.writeBytes("mesaj client\n");
			print(cs.getInputStream());
		}
		cs.close();
	}
}
