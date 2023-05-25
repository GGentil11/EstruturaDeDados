package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest4;

import java.util.Arrays;

import br.icev.eng.Estrutura_de_Dados.Atividade_Fila01.Paciente;
import br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest4.Cliente.Priorida;

public class Fila {
    private int total;
    private int primeiro;
    private int ultimo;
    private int tamanho;
    protected Cliente[] lista_paciente;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        lista_paciente = new Cliente[this.tamanho];
        this.primeiro = 0;
        this.ultimo = 0;
        total = 0;

    }

    public void colocar_na_fila(Cliente elemento) {
        if (isFull()) {
            System.out.println("Fila cheia");
        } else {
            lista_paciente[ultimo] = elemento;
            ultimo = (ultimo + 1) % lista_paciente.length;
            total++;
        }

    }

    public Cliente retira() {
        Cliente elemento = lista_paciente[primeiro];
        primeiro = (this.primeiro + 1) % lista_paciente.length;
        this.total--;
        return elemento;

    }

    public boolean isFull() {
        if (total == lista_paciente.length) {
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

    public void organizar() {
        int m = 0;
        int k = 0;
        Cliente maior = new Cliente("test", 13, Priorida.sem_prioridade);
        Cliente[] troca = new Cliente[tamanho];
        if (lista_paciente.length != 0) {
            for (k = 0; k < ((lista_paciente.length) - 1); k++) {

                for (int j = 0; j < ((lista_paciente.length) - 1); j++) {
                    if (lista_paciente[k].getNivel_prioridade() > lista_paciente[j].getNivel_prioridade()) {
                        maior = lista_paciente[k];
                    }
                }
                troca[k] = maior;

            }
        }

    }

    public void mostraLista() {
        for (Cliente c : lista_paciente) {
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        return "Fila [total=" + total + ", primeiro=" + primeiro + ", ultimo=" + ultimo + ", tamanho=" + tamanho
                + ", lista_paciente=" + Arrays.toString(lista_paciente) + "]";
    }

}
