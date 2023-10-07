public class Notas {
    private double prova1, prova2;

    /* No diagrama da uml / -  */
    public double getMedia(){
        return (prova1 + prova2)/2;
    }

    /*Metodos especiais */

    /*Metodos modificadores */
    public void setProva1(double prova1){
        this.prova1 = prova1;
    }

    public void setProva2(double prova2){
        this.prova2 = prova2;
    }

    /*Metodos acessores */
    public double getProva1(){
        return prova1;
    }
    public double getProva2(){
        return prova2;
    }
}
