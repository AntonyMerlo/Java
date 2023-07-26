import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Banco {

    private ArrayList<ContaBancaria> contas;
    
    public Banco(){
        contas = new ArrayList<>();
    }

    public ContaBancaria getConta(int codigo) {
        ContaBancaria temp = null;

        Iterator<ContaBancaria> it = contas.iterator();

        //boolean achou = false;
        while (it.hasNext()) {
            temp = it.next();
            if (temp.getCodigo() == codigo) {
                return temp;
            }
        }
        return temp;

    }
    
    public void addConta(ContaBancaria conta){
        contas.add(conta);
    }
    
    public void exibirImpostoContas(){
        for (ContaBancaria c: contas){
            

            System.out.println("Codigo conta: " + c.getCodigo() + '\n' +
                                "Imposto da conta: " + c.calcularImposto());
                    
        }
    }
    
    public void ordenarContasCodigo(){
        
        
        Collections.sort(contas,new ComparadorContaCodigo());
        
        
    }
    
    public void ordenarContasSaldo(){
        
        
        Collections.sort(contas,new ComparadorContaSaldo());
        
        
    }
    
    
    @Override
    public String toString(){
        return contas.toString();
    }
    
}
