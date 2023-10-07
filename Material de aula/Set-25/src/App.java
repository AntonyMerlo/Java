/* Herança ou especialização */
public class App {
    public static void main(String[] args) throws Exception {
        PessoaJuridica p = new PessoaJuridica();

        p.setNome("Guilherme");

        System.out.println(p.getNome());
    }
}
