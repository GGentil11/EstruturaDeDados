package Exercicio_Aula19.Questao_1;

public class Caminhao {
    private String placa;
    private int nivelCriticidade;
    private boolean carregado;
    private boolean transportaPerecivel;

    public Caminhao(String placa, int nivelCriticidade, boolean carregado, boolean transportaPerecivel){
        this.placa = placa;
        this.nivelCriticidade = nivelCriticidade;
        this.carregado = carregado;
        this.transportaPerecivel = transportaPerecivel;
    }
    public int getNivelCriticidade() {
        return nivelCriticidade;
    }
    public void setNivelCriticidade(int nivelCriticidade) {
        this.nivelCriticidade = nivelCriticidade;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public boolean isTransportaPerecivel() {
        return transportaPerecivel;
    }
    public void setTransportaPerecivel(boolean transportaPerecivel) {
        this.transportaPerecivel = transportaPerecivel;
    }
    public boolean isCarregado() {
        return carregado;
    }
    public void setCarregado(boolean carregado) {
        this.carregado = carregado;
    }
    @Override
    public String toString() {
        return "Caminhao [placa=" + placa + ", nivelCriticidade=" + nivelCriticidade + ", carregado=" + carregado
                + ", transportaPerecivel=" + transportaPerecivel + "]";
    }
    
}
