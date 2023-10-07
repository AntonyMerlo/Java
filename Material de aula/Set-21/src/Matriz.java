public class Matriz {
    public static void main(String[] args){

        int[][] v = new int[7][];
        for(int i = 0; i < v.length; i++){
            v[i] = new int[i+1];
            v[i][0] = 1;
            v[i][i] = 1;
            for(int j = 1; j < v[i].length - 1; j++){
                v[i][j] = v[i-1][j-1] + v[i-1][j];
            }

        }
        impMatrizEach(v);
    }
    

    public static void imprimeMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void impMatrizEach(int[][] matriz){
        for (int[] mat : matriz) {
            for (int mat2 : mat) {
                System.out.print(mat2 + " ");
            }
            System.out.println();  
        }
    }

}


