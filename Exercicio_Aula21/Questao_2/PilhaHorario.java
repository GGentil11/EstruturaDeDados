package br.icev.eng.Estrutura_de_Dados.atividade_dupla.quest2;
public class PilhaHorario {
    private FilaHrs lista_horarios[];
    private int top =-1;



    public PilhaHorario(int tamanho){
        this.lista_horarios= new FilaHrs[tamanho];

    }


    public void pushe(FilaHrs caminhao){
        top++;
        this.lista_horarios[top]= caminhao;

    }

    public boolean isEmpty(){
            if(top==-1){
                return true;
            }else{
                return false;
            }
    }

    public boolean isFull(){
        if(top==((this.lista_horarios.length)-1)){
            return true;
        }else{
            return false;
        }
    }


    public FilaHrs pop(){
        FilaHrs lista_onibus=this.lista_horarios[top];
        top--;
        return lista_onibus;
    }
}

