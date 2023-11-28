package q5_ArvoreBinaria;

class No {
    int num;
    No esquerda, direita;

    public No(int item) {
        num = item;
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
            System.out.print(no.num + " ");
            percorrerOrdem(no.direita);
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        
        arvore.raiz = new No(3);
        arvore.raiz.esquerda = new No(2);
        arvore.raiz.direita = new No(4);
        arvore.raiz.esquerda.esquerda = new No(1);
        arvore.raiz.direita.direita = new No(5);

        
        System.out.println("Árvore binária em ordem:");
        arvore.percorrerOrdem(arvore.raiz);
    }
}
