package Questao_3;

public class SuporteTecnico{
    private int capacidade = 10;
    private int numeroAtendentes;
    private FilaCircular<Cliente>[] atendente;
    private FilaCircular<Cliente> filaNormal;
    private FilaCircular<Cliente> filaEspecialista;

    public SuporteTecnico(int numeroAtendentes, int capacidade){
        this.numeroAtendentes = numeroAtendentes;
        this.capacidade = capacidade;
        this.atendente = new FilaCircular[numeroAtendentes];
        this.filaNormal = new FilaCircular<>(capacidade);
        this.filaEspecialista = new FilaCircular<>(capacidade);

        for (int i = 0; i<numeroAtendentes; i++){
            atendente[i] = new FilaCircular<>(capacidade);
        }
    }
    public String receberPedido(Cliente cliente) {
        int tipoProblema = cliente.getTipoProblema();
        if(tipoProblema == 1 || tipoProblema == 2){
            if (filaNormal.size() > capacidade){
                return "Não foi possível receber o pedido. Fila Normal já está cheia.";
            }else{
                filaNormal.enqueue(cliente);
            }
        }
        else{
            if (filaEspecialista.size() > capacidade){
                return "Não foi possível receber o pedido. Fila Especialista já está cheia.";
            }else{
                filaEspecialista.enqueue(cliente);
            }
        }
        return "Chamado recebido!";
    }
    public String atenderPedidoNormal(){
        if (filaNormal.isEmpty()){
            return "Fila vazia!";
        }
        Cliente clienteAtendido = filaNormal.dequeue();
        return "Cliente "+ clienteAtendido.getNome() + " foi atendido!";
    }
    public String atenderPedidoEspecial(){
        if (filaEspecialista.isEmpty()){
            return "Fila vazia!";
        }
        Cliente clienteAtendido = filaEspecialista.dequeue();
        return "Cliente "+ clienteAtendido.getNome() + " foi atendido!";
    }
}
