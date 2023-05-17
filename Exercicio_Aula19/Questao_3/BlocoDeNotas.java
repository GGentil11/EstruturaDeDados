package Exercicio_Aula19.Questao_3;

public class BlocoDeNotas <T> extends Pilha<T>{
    public void imprimirNotas(){
        Pilha<T> pilhaAuxiliar = new Pilha<>();
        
        while (!isEmpty()){
            T notas = pop();
            pilhaAuxiliar.push(notas);
            System.out.println(notas);
        }
        while (!pilhaAuxiliar.isEmpty()){
            push(pilhaAuxiliar.pop());
        }
    }
}
