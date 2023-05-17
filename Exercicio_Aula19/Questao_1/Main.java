package Exercicio_Aula19.Questao_1;

public class Main {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();

        Caminhao C1 = new Caminhao("Asad-1234", 2, true, true);
        logistica.nivel2.push(C1);
        Caminhao C2 = new Caminhao("hghf-5678", 1, true, true);
        logistica.nivel1.push(C2); 

        logistica.priorizacao();
    }
}
