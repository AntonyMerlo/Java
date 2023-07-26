//interface de controlador (implements Controlador)
public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodos especiais
    //metodo contrutor
    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }
    //metodo acessor(get)
    private int getVolume(){
        return volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private boolean getTocando(){
        return tocando;
    }

    //metodo modificador(set)
    private void setVolume(int volume){
        this.volume = volume;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //metodos da classe

    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        System.out.println("Está ligado: " + this.getLigado());
        System.out.print("Esta tocando: " + this.getVolume() + " ");
        for(int i = 0; i < this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("\n");
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume(){
        if(this.getLigado() == true){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume(){
        if(this.getLigado()==true){
            this.setVolume(this.getVolume()-5);
        }
    }

    private int auxVolume;
    @Override
    public void ligarMudo(){
        if(this.getLigado()&&this.getVolume()>0){
            this.auxVolume = this.getVolume();
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(this.getLigado()&&this.getVolume()==0){
            this.setVolume(this.auxVolume);
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
