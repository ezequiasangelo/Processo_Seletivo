package ArvoreBinaria;

class No {
    int valor;
    No esquerda, direita;

    public No(int item) {
        valor = item;
        esquerda = direita = null;
    }
}

class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    // Função para percorrer a árvore em ordem e imprimir os valores
    public void percorrerOrdem(No no) {
        if (no != null) {
            percorrerOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerOrdem(no.direita);
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Add os números de 1 a 5
        arvore.raiz = new No(3);
        arvore.raiz.esquerda = new No(2);
        arvore.raiz.direita = new No(4);
        arvore.raiz.esquerda.esquerda = new No(1);
        arvore.raiz.direita.direita = new No(5);

        
        System.out.println("Número em ordem:");
        arvore.percorrerOrdem(arvore.raiz);
    }
}
