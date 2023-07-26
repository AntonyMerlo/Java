public class ContaUniversitaria extends ContaBancaria{

    public ContaUniversitaria(int codigo, double saldo) {
        super(codigo, saldo);
    }

    @Override
    public double calcularImposto() {
        return 0.0;
    }
}
