package Exercicio_Aula18;

public class CorretorMatematico {
    public static String determinar(String expressaoMatematica){
        Pilha<String> pilha = new Pilha<>();
        String[] operadores = expressaoMatematica.split("");

        for (int i = 0; i<operadores.length; i++){
            String operador = operadores[i];

            if (operador.equals("(") || operador.equals("[") || operador.equals("{") || 
            operador.equals("⎣") || operador.equals("⎡")) {
                pilha.push(operador);
            } else if (operador.equals(")") || operador.equals("]") || operador.equals("}") || 
            operador.equals("⎦") || operador.equals("⎤")) {
                if (pilha.isEmpty()) {
                    return "Expressão Matemática Inválida";
                }
                String ultimo = pilha.top();

                if ((operador.equals(")") && ultimo.equals("(")) ||
                        (operador.equals("]") && ultimo.equals("[")) ||
                        (operador.equals("}") && ultimo.equals("{")) ||
                        (operador.equals("⎦") && ultimo.equals("⎣")) ||
                        (operador.equals("⎤") && ultimo.equals("⎡"))) {
                    pilha.pop();
                } else {
                    return "Expressão Matemática Inválida";
                }
            }
        }
        if (!pilha.isEmpty()){
            return "Expressão Matemática Inválida";
        }
        return "Expressão Matemática Válida";
    }
}