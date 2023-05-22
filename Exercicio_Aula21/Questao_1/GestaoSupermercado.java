package Questao_1;

public class GestaoSupermercado <Cliente>{
    private FilaCircular<Cliente>[] filasCaixas;
    private int numeroCaixas;
    private int capacidade = 10;

    public GestaoSupermercado(int numeroCaixas, int capacidade){
        this.numeroCaixas = numeroCaixas;
        this.capacidade = capacidade;
        this.filasCaixas = new FilaCircular[numeroCaixas];

        for (int i = 0; i<numeroCaixas; i++){
            filasCaixas[i] = new FilaCircular<>(capacidade);
        }
    }
    public void abrirCaixa(Cliente cliente){
        int menorFila = filasCaixas[0].size();
        int indiceMenorFila = 0;

        for (int i = 1; i<numeroCaixas; i++){
            if (filasCaixas[i].size() < menorFila){
                menorFila = filasCaixas[i].size();
                indiceMenorFila = i;
            }
        }
        if (filasCaixas[indiceMenorFila].size() > 2){
            filasCaixas[indiceMenorFila].enqueue(cliente);
        }
    }
    public Cliente atenderCliente(int caixa){
        if (filasCaixas[caixa].isEmpty()){
            return null;
        }
        return filasCaixas[caixa].dequeue();
    }
}
