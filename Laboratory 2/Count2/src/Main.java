//import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//File file = new File("F:\\Java_WorkSpace\\Facultate\\Count\\src\\input.txt");
		PrintWriter writer = new PrintWriter("file.html", "UTF-8");
		Scanner sc = new Scanner(args[0]);
		String linie = null, urlString = null;
		
		urlString = sc.nextLine();
		URL url = new URL(urlString);
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		sc.close();
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(connection.getInputStream());
		
		while(input.hasNextLine() != false){
			linie = input.nextLine();
			
				//System.out.println(linie);
				Pattern p = Pattern.compile("href=\"(.*?)\"");
				Matcher m = p.matcher(linie);
				String url1 = null;
				if (m.find()) {
					url1 = m.group(1);	// this variable should contain the link URL
					System.out.println(url1);
				}

			writer.println(linie);
		}
		writer.close();
	}
}
