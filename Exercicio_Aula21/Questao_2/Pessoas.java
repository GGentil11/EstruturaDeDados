package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2;

public class Pessoas {
    private String nome;
    private int idade;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Pessoas [nome=" + nome + ", idade=" + idade + "]";
    }
    
}
