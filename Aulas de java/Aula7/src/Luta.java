import java.util.Random;

public class Luta{
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    //metodos especiais
    //getters
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public int getRounds(){
        return this.rounds;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }
    //setter
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    public void setAprovado(boolean aprovada){
        this.aprovada = aprovada;
    }

    //metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;  
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada == true){
            System.out.println("###Desafiante###");
            this.desafiado.apresentar();
            System.out.println("###Desafiado###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("###Resultado###");
            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiado.empatarLuta();
                break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 3:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiado.ganharLuta();
                break;
            }
        }
        else{
            System.out.println("Luta não pode acontecer");
        }
    }
}
