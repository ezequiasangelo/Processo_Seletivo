package q4_Verificação_de_Palindromos;

import java.util.Scanner;

public class palindromos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Escreva uma palavra para sabermos se é um palídromo: Ex: ara, anilina, ama...");
		String palavra = scanner.next();
		scanner.close();
		
		
		System.out.println("É um palídromo? " + informaPalidromo(palavra));
		
	}
	
	public static boolean informaPalidromo(String palavra) {
		
		String TrazFrente = "";
		
		for(int i = palavra.length() - 1; i >= 0; i --) {
			
			TrazFrente += palavra.charAt(i); //Pega qualquer palavra de Traz para Frente 
			
		}
		
		return palavra.equals(TrazFrente);
		
	}

}

