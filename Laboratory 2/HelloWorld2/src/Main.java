
public class Main {

	public static void main(String[] args) {
		
		Test2 X = null;
		int apeluri = 10;
		
		for(int i = 0; i < apeluri; i++){
			X = new Test2();
		}

		System.out.println(X.getApeluri());
	}

}
