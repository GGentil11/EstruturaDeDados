package Exercicio_Aula19.Questao_3;

public class Main {
    public static void main(String[] args) {
        BlocoDeNotas <String> notas = new BlocoDeNotas<>();
        notas.push("Teste 1");
        notas.push("Teste 2");
        notas.push("Teste 3");

        notas.imprimirNotas();
    }
}
