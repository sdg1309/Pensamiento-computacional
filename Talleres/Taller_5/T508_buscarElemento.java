package Talleres.Taller_5;

public class T508_buscarElemento {
    public static void buscarElemento(int[][] matriz, int x){
        int n = matriz.length; int m = matriz[0].length;
        boolean encon = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matriz[i][j] == x){
                    System.out.println("Fila: " + i + ", Columna: " + j);
                    encon = true;
                }
            }
        }   

        if(!encon){
            System.out.println("No encontrado");
        }

    }
}
