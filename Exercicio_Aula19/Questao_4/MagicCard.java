package Exercicio_Aula19.Questao_4;

public class MagicCard <MagicCard>{
    String name; 
    String type; 
    String cost;
    String effect;
    
    public MagicCard(String name, String type, String cost, String effect) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.effect = effect;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
    @Override
    public String toString() {
        return "Carta: " + name + ", Tipo:" + type + ", Custo: " + cost + ", Efeito:" + effect;
    }
    
}