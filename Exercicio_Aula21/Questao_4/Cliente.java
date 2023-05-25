package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest4;

import br.icev.eng.Estrutura_de_Dados.Atividade_Fila01.Paciente;

public class Cliente {
    enum Priorida {
        idoso, deficiente, sem_prioridade
    }

    private String nome;
    private int idade;
    private Priorida prioridade;
    private int nivel_prioridade;

    public Cliente(String nome, int idade, Priorida prioridade) {
        this.nome = nome;
        this.idade = idade;
        this.prioridade = prioridade;
        if (prioridade == Priorida.sem_prioridade) {
            this.nivel_prioridade = 1;
        } else if(prioridade==Priorida.deficiente) {
            this.nivel_prioridade = 2;
        }else{
            this.nivel_prioridade=3;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Priorida getPrioridade() {
        return prioridade;
    }

    public void setNivel_prioridade(int nivel_prioridade) {
        this.nivel_prioridade = nivel_prioridade;
    }

    public int getNivel_prioridade() {
        return nivel_prioridade;
    }

    public void setPrioridade(Priorida prioridade) {
        this.prioridade = prioridade;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", prioridade=" + prioridade + ", nivel_prioridade="
                + nivel_prioridade + "]";
    }


}
