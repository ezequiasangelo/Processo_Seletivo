package Ordenacao_simples;

public class Lista_Ordenacao_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] lista = {3,4,1,2};
		int aux;
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if(lista[j] > lista[j+1]) {
					aux = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = aux;
					
				}
				
			}
		}
		int y = 0;
		while(y < lista.length) {
			System.out.print(lista[y] + ",");
			y++;
		}
		
	}

}
