package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2;

import br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2.Onibus.Hoario;

public class Implemen {
    public static void main(String[] args) {
        Onibus o1= new Onibus("12245", "zé",Hoario.das10);
        Onibus o2= new Onibus("12245", "alan-2",Hoario.das11);
        Onibus o3= new Onibus("12245", "gentil03",Hoario.das12);
        Onibus o4= new Onibus("12245", "Ivanna04",Hoario.das12);
        Onibus o5= new Onibus("12245", "garen-23",Hoario.das11);
        Onibus o6= new Onibus("12245", "mouser789",Hoario.das12);


        Pessoas p1 = new Pessoas("Alan", 10);
        Pessoas p2 = new Pessoas("Alan-1", 10);
        Pessoas p3 = new Pessoas("Alan-2", 10);
        Pessoas p4 = new Pessoas("Alan-3", 10);

        Terminal t1 = new Terminal();
        t1.cadastra_onibus(o1);  
        t1.cadastra_onibus(o2);
        t1.cadastra_onibus(o3);  
        t1.cadastra_onibus(o4);  
        t1.cadastra_onibus(o5);  
        t1.cadastra_onibus(o6);        
    }
}
