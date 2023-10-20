public class Main {
    public static void main(String[] args) throws Exception {
        ClientePrata cp = new ClientePrata("Felipe", 100);
        ClienteOuro co = new ClienteOuro("Guilherme", 100, 2);

        System.out.println(cp.toString() + "\nDesconto: " + cp.calcularDesconto());
        
        System.out.println(co.toString() + "\nDesconto: " + co.calcularDesconto());
    }
}
