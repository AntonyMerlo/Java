
public class Aula02 {
    public static void main(String[] args) {
        System.out.println("Caneta 1:");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("\nCaneta 2:");
        Caneta c2 = new Caneta();
        c2.modelo = "bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
