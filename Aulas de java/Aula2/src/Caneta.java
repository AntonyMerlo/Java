
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada==false){
            System.out.println("Estou rabiscando");
        }
        else{
            System.out.println("Não posso rabiscar");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }   
}