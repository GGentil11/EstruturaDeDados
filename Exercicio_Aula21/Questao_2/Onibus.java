package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2;

public class Onibus {
    enum Hoario{
            das10,das11,das12
    }
    private String placa;
    private String nome_motorista;
    private Hoario hoario;

    public Onibus(String placa, String nome_motorista, Hoario hoario) {
        this.placa = placa;
        this.nome_motorista = nome_motorista;
        this.hoario =hoario;
    }
    public String getPlaca() {
        return placa;
    }
    public String getNome_motorista() {
        return nome_motorista;
    }
    public Hoario getHoario() {
        return hoario;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setHoario(Hoario hoario) {
        this.hoario = hoario;
    }
    public void setNome_motorista(String nome_motorista) {
        this.nome_motorista = nome_motorista;
    }
    @Override
    public String toString() {
        return "Onibus [placa=" + placa + ", nome_motorista=" + nome_motorista + "]";
    }

}
