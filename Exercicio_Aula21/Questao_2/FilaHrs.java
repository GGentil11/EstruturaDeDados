package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2;

public class FilaHrs {
    private int total;
    private int primeiro;
    private int ultimo;
    private int tamanho;
    protected Onibus[] lista_onibus;

    public FilaHrs(int tamanho) {
        this.tamanho = tamanho;
        lista_onibus = new Onibus[this.tamanho];
        this.primeiro = 0;
        this.ultimo = 0;
        total = 0;

    }

    public void colocar_na_fila(Onibus elemento) {
        if (isFull()) {
            System.out.println("Fila cheia");
        } else {
            lista_onibus[ultimo] = elemento;
            ultimo = (ultimo + 1) % lista_onibus.length;
            total++;
        }

    }

    public Onibus retira() {
        Onibus elemento = lista_onibus[primeiro];
        primeiro = (this.primeiro + 1) % lista_onibus.length;
        this.total--;
        return elemento;

    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public void setLista_onibus(Onibus[] lista_onibus) {
        this.lista_onibus = lista_onibus;
    }

    public boolean isFull() {
        if (total == lista_onibus.length) {
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
