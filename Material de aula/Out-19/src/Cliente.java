//no diagrama esta em italico então e abstract
public abstract class Cliente {
    private String nome;
    private double valorDevido;

    //metodos especiais
    //construtor
    public Cliente(String nome, double valorDevido){
        setNome(nome);
        setValorDevido(valorDevido);
    }
    //acessores e modificadores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorDevido() {
        return valorDevido;
    }
    public void setValorDevido(double valorDevido) {
        this.valorDevido = valorDevido;
    }

    //metodos do codigo 
    public String toString(){
        return "------------Pessoa------------\n" + "Nome: " + nome + "\nValor: " + valorDevido;
    }

    public abstract double calcularDesconto();
}
