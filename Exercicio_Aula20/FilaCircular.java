package Exercicio_Aula20;

import java.util.NoSuchElementException;

public class FilaCircular <T>{
    private int capacidade;
    private T[] filaCircular;
    private int size;
    private int inicio;
    private int fim;

    public FilaCircular(int capacidade){
        this.capacidade = capacidade;   
        this.filaCircular = (T[]) new Object[capacidade];   
        this.size = 0;
        this.inicio = 0;
        this.fim = -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public T front(){
        if(isEmpty()){
            return null;
        }
        return filaCircular[inicio];
    }
    public void enqueue(T elemento){
        if (size == capacidade){
            throw new IllegalStateException("Fila Cheia. Não há como adicionar elementos");
        }
        fim = (fim + 1) % capacidade;
        filaCircular[fim] = elemento;
        size++;
    }
    public T dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Fila Vazia. Não há como retirar elementos");
        }
        T alfa = filaCircular[inicio];
        filaCircular[inicio] = null;
        inicio = (inicio + 1) % capacidade; 
        size--;

        return alfa;
    } 
}