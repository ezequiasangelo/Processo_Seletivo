package q2_Ordenacao_simples;

public class Lista_Ordenacao_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] lista = {3,4,1,2};
		int temp;
		
		for (int i = 0; i < lista.length; i++) {
		
			//O J compara e troca elementos adjacentes se tiverem na ordem errada
			for (int j = 0; j < lista.length - 1; j++) {
			// Se o elemento é maior que o próximo será trocado	
			if(lista[j] > lista[j+1]) {
				temp = lista[j];
				lista[j] = lista[j+1];
				lista[j+1] = temp;
					
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
