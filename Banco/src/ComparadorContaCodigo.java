public class ComparadorContaCodigo implements Comparator<ContaBancaria>{
    @Override
    public int compare(ContaBancaria c1, ContaBancaria c2){
        return c1.getCodigo() - c2.getCodigo();
    }
    
}
