package Exercicio_Aula18;

import java.util.Scanner;

public class TesteExpressao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a Expressão: ");
        String expressaoMatematica = input.nextLine();
        String resultado = CorretorMatematico.determinar(expressaoMatematica);
        input.close();
        System.out.println("Resultado: " + resultado);
    }
}
