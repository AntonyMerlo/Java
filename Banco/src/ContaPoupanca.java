public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(int codigo, double saldo){
        super(codigo,saldo);
    }
    
    @Override
    public double calcularImposto(){
        return 0.02 * getSaldo(); //ok? imposto de poupança é 2% do valor do saldo
    } 
}
