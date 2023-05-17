package Exercicio_Aula19.Questao_2;

public class Main {
    public static void main(String[] args) {
        PilhaVoltar<String> pilhaVoltar = new PilhaVoltar<String>();

        pilhaVoltar.realizarAcao("Ação 1");    
        pilhaVoltar.realizarAcao("Ação 2");
        pilhaVoltar.realizarAcao("Ação 3");
        pilhaVoltar.realizarAcao("Ação 4");
        
        pilhaVoltar.voltarAcao(); 
        pilhaVoltar.voltarAcao();

        while (!pilhaVoltar.isEmpty()) {
            System.out.println("Item: "+ pilhaVoltar.pop());
        }
    }
}