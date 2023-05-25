package Questao_3;

public class Main {
    public static void main(String[] args) {
        SuporteTecnico suporte = new SuporteTecnico(3, 10);
        Cliente cliente1 = new Cliente("Gabriel", 1);
        Cliente cliente2 = new Cliente("Alan", 1);
        Cliente cliente3 = new Cliente("Deivid", 2);
        Cliente cliente4 = new Cliente("Modesto", 3);

        suporte.receberPedido(cliente1);
        suporte.receberPedido(cliente2);
        suporte.receberPedido(cliente3);
        suporte.receberPedido(cliente4);

        System.out.println(suporte.atenderPedidoEspecial());
        System.out.println(suporte.atenderPedidoNormal());
        System.out.println(suporte.atenderPedidoNormal());
    }
}
