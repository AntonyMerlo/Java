public class ClientePrata extends Cliente{
    public ClientePrata(String nome, double valorDevido){
        super(nome, valorDevido);
    }

    public double calcularDesconto(){
        return getValorDevido() * 0.05;
    }

}