import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
//	public static void count(HashMap<String,Integer>){
//		
//	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Java_WorkSpace\\Facultate\\Count\\src\\input.txt");
		Scanner sc = new Scanner(file);
		String cuvant = null, urlString = null;
		int valoare = 0;
		
		HashMap<String,Integer> cuvinte = new HashMap<String, Integer>();
		
		urlString = sc.nextLine();
		URL url = new URL(urlString);
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		sc.close();
		
//		while(sc.hasNext() != false){
//			cuvant = sc.next();
//			if(cuvinte.containsKey(cuvant) == true){
//				valoare = cuvinte.get(cuvant).intValue();
//				cuvinte.put(cuvant, valoare + 1);
//			}
//			else
//				cuvinte.put(cuvant, 1);
//		}
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(connection.getInputStream());
		
		while(input.hasNext() != false){
		cuvant = input.next();
		if(cuvinte.containsKey(cuvant) == true){
			valoare = cuvinte.get(cuvant).intValue();
			cuvinte.put(cuvant, valoare + 1);
		}
		else
			cuvinte.put(cuvant, 1);
	}
		
	  Map<String, Integer> map = sortByValues(cuvinte); 
			  // new TreeMap<String, Integer>(cuvinte);
	  
      Set set = map.entrySet();
	  Iterator i = set.iterator();
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
	}
	
	private static HashMap<String, Integer> sortByValues(HashMap<String, Integer> map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator<Object>() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }

}
