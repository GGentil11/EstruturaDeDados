package Exercicio_Aula19.Questao_4;

public class Main {
    public static void main(String[] args) {
        Pilha<MagicCard> pilha = new Pilha<>();

        // Adicionar algumas cartas à pilha
        MagicCard carta1 = new MagicCard("Island", "terreno", "0", "Vira Ilha");
        MagicCard carta2 = new MagicCard("Olivia Voldaren", "habilidade ativada", "1", "Causa 1 de Dano");
        
        pilha.push(carta1);
        pilha.push(carta2);
        
        // Verificar o tamanho da pilha
        System.out.println("Tamanho da pilha: " + pilha.size());

        // Remover carta usando o método pop
        MagicCard removida1 = pilha.pop();
        System.out.println("Carta removida: " + removida1.getName());// Saída: Carta removida: Carta 2 (Olivia Voldaren)

        // Verificar a carta no topo da pilha
        MagicCard topo = pilha.top();
        System.out.println("Carta no topo: " + topo.getName()); // Saída: Carta no topo: Island

        // Verificar se a pilha está vazia
        System.out.println("Pilha vazia? " + pilha.isEmpty()); // Saída: false

        // Limpar a pilha, para que seja possível adicionar outra carta especial
        pilha.clear();

        //Adicionando outras cartas
        MagicCard carta3 = new MagicCard("Expresso de Aradara", "artefato", "0", "Tripular");
        pilha.push(carta3);
        MagicCard carta4 = new MagicCard("Huntmaste of the Fells", "disparada ", "2", "Caça");
        pilha.push(carta4);

        //Remove a carta 3(Expresso de Aradara) de qualquer lugar da pilha
        pilha.removerQualquerLugar(carta3);

        //Verifica o tamanho da pilha
        System.out.println("Tamanho da pilha: " + pilha.size());
    }
}