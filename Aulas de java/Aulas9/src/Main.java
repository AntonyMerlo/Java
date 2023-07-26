public class Main {
    public static void main(String[] args){
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];

        p[0]= new Pessoa("Maria", 15, "f");
        p[1] = new Pessoa("Bob", 25, "m");

        l[0] = new Livro("Uma longa vida", "José da silva", 300, p[0]);
        l[1] = new Livro("Uma longa jornada", "Maria Candido", 800, p[1]);

        System.out.println(l[0].detalhes() + "\n" + l[1].detalhes());
    }
}
