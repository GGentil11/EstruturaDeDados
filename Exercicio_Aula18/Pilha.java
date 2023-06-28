package Exercicio_Aula18;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


public class Pilha <T>{
    private List<T> pilha = new ArrayList<T>();
    
    public void push(T t){
        pilha.add(t);
    }
    public int size(){
        return pilha.size();
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return pilha.remove(size()-1);
    }
    public boolean isEmpty(){
        return pilha.isEmpty();
    }
    public T top(){
        if (isEmpty()){ 
            throw new EmptyStackException();
        }
        return pilha.get(size()-1);
    }
}
