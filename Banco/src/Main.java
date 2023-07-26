import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Banco b = new Banco();
        b.addConta(new ContaPoupanca(2, 13.0));
        b.addConta(new ContaCorrente(1, 11.0));
        b.addConta(new ContaUniversitaria(3, 2.0));

        System.out.println(b);
        
        b.ordenarContasCodigo();
        
        System.out.println(b);
        
        
        b.ordenarContasSaldo();
        
        System.out.println(b);

        


        
        
    }
}
