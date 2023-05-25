package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest4;

import br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest4.Cliente.Priorida;

public class implementa {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alan-1",12,Priorida.idoso);
        Cliente c2 = new Cliente("Alan-2",12,Priorida.deficiente);
        Cliente c3 = new Cliente("Alan-3",12,Priorida.sem_prioridade);
        Cliente c4 = new Cliente("Alan-4",12,Priorida.sem_prioridade);
        Fila f1 = new Fila(5);
        f1.colocar_na_fila(c4);
        f1.colocar_na_fila(c3);
        f1.colocar_na_fila(c2);
        f1.colocar_na_fila(c1);
        f1.organizar();
        f1.mostraLista();
        
    }
}
