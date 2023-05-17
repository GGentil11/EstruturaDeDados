package Exercicio_Aula19.Questao_4;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha <T>{
    private List<MagicCard> pilha = new ArrayList<MagicCard>();
    
    private boolean isTipoEspecial(String tipo) {
        String[] tiposEspeciais = {"terreno", "criatura", "encantamento", "artefato", "planeswalker", "feitiço"};
        for (String tipoEspecial : tiposEspeciais) {
            if (tipo.equals(tipoEspecial)) {
                return true;
            }
        }
        return false;
    }
    public void push(MagicCard carta){
        if (isTipoEspecial(carta.getType())) {
            if (!pilha.isEmpty()) {
                throw new IllegalArgumentException("Use o método clear antes de colocar esse tipo de carta!");
            }
        }
        pilha.add(carta);
    }
    public int size(){
        return pilha.size();
    }
    public MagicCard pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return pilha.remove(size()-1);
    }
    public boolean isEmpty(){
        return pilha.isEmpty();
    }
    public MagicCard top(){
        if (isEmpty()){ 
            throw new EmptyStackException();
        }
        return pilha.get(size()-1);
    }
    public String clear(){
        while(!isEmpty()){
            pop();
        }
        return "Pilha limpa";
    }
    public void removerQualquerLugar(MagicCard carta){
        Pilha <T> pilhaAuxiliar = new Pilha<>();
        while(!isEmpty()){
            if (!top().equals(carta)){
                pilhaAuxiliar.push(pop());
            }
            pop();
        }
        while(!pilhaAuxiliar.isEmpty()){
            push(pilhaAuxiliar.pop());
        }
    }
    
}

