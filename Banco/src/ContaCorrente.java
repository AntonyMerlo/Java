public class ContaCorrente extends ContaBancaria {

  //obrigado a definir construtor, porque a superclasse não possui construtor sem parâmetros
    public ContaCorrente(int codigo, double saldo) {
        super(codigo, saldo);//eis aqui o que tenho que passar para chamar o construtor da superclasse
    }

    @Override
    public double calcularImposto() {
        return 0.05 * getSaldo();
    }
   


    
    
    
}
