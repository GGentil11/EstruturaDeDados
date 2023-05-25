package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2;

import br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2.Onibus.Hoario;

public class Terminal {
    
    public void colocar_na_fila_embarque(Pessoas pessoa, int quant_pessoas){      
        FilaEbarque f1=new FilaEbarque(quant_pessoas);
        f1.colocar_na_fila(pessoa);

    }


    public void cadastra_onibus(Onibus onibus){
        PilhaHorario pilha_das_10as12 = new PilhaHorario(3);
        FilaDas12Hrs f12 = new FilaDas12Hrs(10);
        FilaDas11Hrs f11 = new FilaDas11Hrs(10);
        FilaDas10Hrs f10 = new FilaDas10Hrs(10);
        pilha_das_10as12.pushe(f12);
        pilha_das_10as12.pushe(f11);
        pilha_das_10as12.pushe(f10);
        if(onibus.getHoario()==Hoario.das10){
            f10.colocar_na_fila(onibus);
            return;  
        }else if(onibus.getHoario()==Hoario.das11){
            f11.colocar_na_fila(onibus);
            return;

        }
        f12.colocar_na_fila(onibus);


    }


}
