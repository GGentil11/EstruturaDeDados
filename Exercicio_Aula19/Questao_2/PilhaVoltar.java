package Exercicio_Aula19.Questao_2;

public class PilhaVoltar <T> extends Pilha<T>{
    public void realizarAcao (T acao){
        if (size() > 15){
            System.out.println("Pilha Auxiliar já está cheia");
        }
        else{
            push(acao);
        }
    }
    public void voltarAcao(){
        if (isEmpty()){
            System.out.println("Pilha Vazia");
        }
        else{
            T ultimaAcao = pop();
            System.out.println("Desfazendo a ação: " + ultimaAcao);
        }
    }
}
