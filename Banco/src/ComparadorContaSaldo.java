public class ComparadorContaSaldo implements Comparator<ContaBancaria>{

    @Override
    public int compare(ContaBancaria c1, ContaBancaria c2) {
        if(c1.getSaldo() < c2.getSaldo()){
            return -1;
        } else {
        if (c1.getSaldo() == c2.getSaldo())
            return 0;
        }
        return 1;
    }
    

    
}
