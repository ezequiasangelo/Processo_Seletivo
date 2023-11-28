package q3_Lista_Ordenada;


import java.util.Scanner;

public class Lista_Ordenada_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
	        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
	        System.out.print("Digite um número que seja de 1 a 10. ");
	        int numDigitado = scanner.nextInt();	        
	        
	        int posicao = buscarLista(lista, numDigitado);
	        
	        if(posicao != -1) {
	        	System.out.println("Seu número " + numDigitado + " está na posição " + posicao + " da lista.");
	        }else {
	        	System.out.println("O número " + numDigitado + " não tem na lista.");
	        }
	        
	        scanner.close();

	}

	private static int buscarLista(int[] lista, int alvo) {
		
		int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (lista[meio] == alvo) {
                return meio; 
            } else if (lista[meio] < alvo) {
                inicio = meio + 1; 
            } else {
                fim = meio - 1; 
            }
        }
        
        
        return -1; 
    }
}