public class ForIt {
    public static void main(String[] args){
        String[] palavras = new String[10];

        //for-each
        for(String palavra: palavras){
            System.out.print(palavra + " ");
        }
        System.out.println("");
        //for normal
        for(int i = 0; i < palavras.length; i++){
            System.out.print(palavras[i] + " ");
        }
    }
}
