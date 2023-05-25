package Questao_3;

public class Cliente {
    String nome;
    int tipoProblema;

    public Cliente(String nome, int tipoProblema){
        this.nome = nome;
        this.tipoProblema = tipoProblema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(int tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
    
}
