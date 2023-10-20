public class ClienteOuro extends Cliente{
    private int nivel;

    public ClienteOuro(String nome, double valorDevido, int nivel){
        super(nome, valorDevido);
        setNivel(nivel);
    }

    //metodos especiais
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public double calcularDesconto(){
        return getValorDevido()*((5.0+nivel)/100);
    }

    @Override
    public String toString(){
        return super.toString() + "\nNivel: " + nivel;
    }
}
