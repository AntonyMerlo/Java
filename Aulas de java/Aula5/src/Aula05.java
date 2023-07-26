public class Aula05 {
    public static void main(String[] args){
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumConta(1);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        p1.informa();

        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        p2.informa();

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.fecharConta();
        
        p1.informa();
        p2.informa();

    }
}
