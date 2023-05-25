package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2;

public class FilaEbarque {
    private int total;
    private int primeiro;
    private int ultimo;
    private int tamanho;
    protected Pessoas[] lista_pessoas;

    public FilaEbarque(int tamanho) {
        this.tamanho = tamanho;
        lista_pessoas = new Pessoas[this.tamanho];
        this.primeiro = 0;
        this.ultimo = 0;
        total = 0;

    }

    public void colocar_na_fila(Pessoas elemento) {
        if (isFull()) {
            System.out.println("Fila cheia");
        } else {
            lista_pessoas[ultimo] = elemento;
            ultimo = (ultimo + 1) % lista_pessoas.length;
            total++;
        }

    }

    public Pessoas retira() {
        Pessoas elemento = lista_pessoas[primeiro];
        primeiro = (this.primeiro + 1) % lista_pessoas.length;
        this.total--;
        return elemento;

    }

    public boolean isFull() {
        if (total == lista_pessoas.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public int total() {
        return this.total;
    
}
}
