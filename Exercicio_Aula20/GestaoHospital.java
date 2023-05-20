package Exercicio_Aula20;

public class GestaoHospital {
    private FilaCircular<Paciente> filaNormal;
    private FilaCircular<Paciente> filaLeve;
    private FilaCircular<Paciente> filaModerado;
    private FilaCircular<Paciente> filaSevero;

    public GestaoHospital() {
        filaNormal = new FilaCircular<>(10);
        filaLeve = new FilaCircular<>(10);
        filaModerado = new FilaCircular<>(10);
        filaSevero = new FilaCircular<>(10);
    }
    public void adicionarPaciente(Paciente p) {
        switch (p.getPrioridade()){
            case 0:
                filaNormal.enqueue(p);
                break;
            case 1:
                filaLeve.enqueue(p);
                break;
            case 2:
                filaModerado.enqueue(p);
                break;
            case 3:
                filaSevero.enqueue(p);
                break;
            default:
                System.out.println("Prioridade Inválida");
        }
    }
    public void atenderPaciente(){
        if (!filaSevero.isEmpty()){
            Paciente p = filaSevero.dequeue();
            System.out.println("Paciente "+ p.getNome()+" de prioridade Severo será atendido");
        }
        if (!filaModerado.isEmpty()){
            Paciente p = filaModerado.dequeue();
            System.out.println("Paciente "+ p.getNome()+" de prioridade Moderado será atendido");
        }
        if (!filaLeve.isEmpty()){
            Paciente p = filaLeve.dequeue();
            System.out.println("Paciente "+ p.getNome()+" de prioridade Leve será atendido");
        }
        if (!filaSevero.isEmpty()){
            Paciente p = filaSevero.dequeue();
            System.out.println("Paciente "+ p.getNome()+" de prioridade Severo será atendido");
        }
        if (!filaModerado.isEmpty()){
            Paciente p = filaModerado.dequeue();
            System.out.println("Paciente "+ p.getNome()+" de prioridade Moderado será atendido");
        }
        if (!filaSevero.isEmpty()){
            Paciente p = filaSevero.dequeue();
            System.out.println("Paciente "+ p.getNome()+" de prioridade Severo será atendido");
        }
        if (!filaNormal.isEmpty()){
            Paciente p = filaNormal.dequeue();
            System.out.println("Paciente "+ p.getNome()+" de prioridade Normal será atendido");
        }
    }
    public String numeroPacientes(){
        return "Pacientes em fila Normal: " + filaNormal.size() + "\n" + 
        "Pacientes em fila Leve: " + filaLeve.size() + "\n" +
        "Pacientes em fila Moderado: " + filaModerado.size() + "\n" +
        "Pacientes em fila Severo: " + filaSevero.size() + "\n" +
        "Total: "+ (filaNormal.size() + filaLeve.size() + 
        filaModerado.size() + filaSevero.size());
    }
    
}
