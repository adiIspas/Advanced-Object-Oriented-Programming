import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	static void print(InputStream is) throws IOException {
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();

		System.out.println(line);
	}

	public static void main(String[] args) throws IOException {
		final int PORT = 6671;
		ServerSocket ss = new ServerSocket(PORT);
		Socket s;
		int mesaj = 0;
		while (true) {
			s = ss.accept();
			while (true) {
				print(s.getInputStream());
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				dos.writeBytes("mesaj server\n");
				mesaj++;
				if (mesaj == 5) {
					s.close();
					//ss.close();
					break;
				}
			}
		}
	}
}
