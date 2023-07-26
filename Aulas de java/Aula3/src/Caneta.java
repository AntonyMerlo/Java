
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada==false){
            System.out.println("Estou rabiscando");
        }
        else{
            System.out.println("Não posso rabiscar");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }   
}