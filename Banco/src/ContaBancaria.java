public abstract class ContaBancaria /*implements Comparable<ContaBancaria>*/{
    private int codigo;
    private double saldo;
    
    //construtor e, em seguida, os getters e setters (ok?)
    public ContaBancaria(int codigo, double saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract double calcularImposto();
    
    /* removido por adotar outra estratégia de comparação
    @Override
    public int compareTo(ContaBancaria c){
        
        if (saldo < c.saldo){
            return -1;
        } else{
            if (saldo == c.saldo){
                return 0;
            }
        }
        return 1;
    }*/
    
   @Override
    public String toString(){
        return "Codigo: " + codigo + " Saldo: " + saldo;
    }
   
    
    
}
