public class Teste {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[3];

        p[0] = new Pessoa("felipe", 20);
        p[1] = new Pessoa("guilherme", 23);
        p[2] = new Pessoa("Matheus", 50);

        for(int i = 0; i <= p.length; i++){
            System.out.println("Pessoa " + i +"\nNome: " + p[i].getNome() + " Idade: " + p[i].getIdade());
        }
    }
}
