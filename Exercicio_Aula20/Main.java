package Exercicio_Aula20;

public class Main {
    public static void main(String[] args) {
        GestaoHospital gestao = new GestaoHospital();
        Paciente paciente1 = new Paciente("Gabriel", 123456789, 3);
        Paciente paciente2 = new Paciente("Joao", 321421424, 0);
        Paciente paciente3 = new Paciente("Maria", 42135454, 1);
        Paciente paciente4 = new Paciente("José", 123656789, 1);
        Paciente paciente5 = new Paciente("Arthur", 432432423, 2);
        Paciente paciente6 = new Paciente("Eduarda", 999958432, 2);
        Paciente paciente7 = new Paciente("Felipe", 876765765, 3);
        Paciente paciente8 = new Paciente("Ana", 444444444, 3);
        Paciente paciente9 = new Paciente("Camila", 0000000000, 3);

        gestao.adicionarPaciente(paciente1);
        gestao.adicionarPaciente(paciente2);
        gestao.adicionarPaciente(paciente3);
        gestao.adicionarPaciente(paciente4);
        gestao.adicionarPaciente(paciente5);
        gestao.adicionarPaciente(paciente6);
        gestao.adicionarPaciente(paciente7);
        gestao.adicionarPaciente(paciente8);   
        gestao.adicionarPaciente(paciente9);    

        System.out.println(gestao.numeroPacientes());
        System.out.println("__________________________________________");
        gestao.atenderPaciente();
        System.out.println("__________________________________________");
        
        System.out.println(gestao.numeroPacientes());
        System.out.println("__________________________________________");

        gestao.atenderPaciente();
        System.out.println("__________________________________________");
        System.out.println(gestao.numeroPacientes());
    }
}
