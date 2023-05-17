package Exercicio_Aula19.Questao_1;

public class Logistica {
    Pilha <Caminhao> nivel1 = new Pilha<Caminhao>();
    Pilha <Caminhao> nivel2 = new Pilha<Caminhao>();

    public void priorizacao(){
        while(!nivel1.isEmpty() || !nivel2.isEmpty()){
            if (!nivel2.isEmpty()) {
                Caminhao caminhao = nivel2.pop();
                System.out.println("Próximo caminhão a sair (Nível 2 de prioridade): " + caminhao); 
            } else if (!nivel1.isEmpty()) {
                Caminhao caminhao = nivel1.pop();
                System.out.println("Próximo caminhão a sair (Nível 1 de prioridade): " + caminhao);            }
        }
    }
}
