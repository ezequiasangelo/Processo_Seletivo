package fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 = 1;
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Resultado " + n1);
			n2 = n1 + n2;
			n1 = n2 - n1;
			
			
		}
	
		
	}

}
