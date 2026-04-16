package Talleres.Taller_5;

public class T507_rotarMatriz {
    public static int[][] rotar90(int[][] matriz){

        int ord = matriz[0].length;
        int[][] rotada = new int[ord][ord];

        for (int i = 0; i < ord; i++) {
            for (int j = 0; j < ord; j++) {
                rotada[j][ord - 1 - i] = matriz[i][j];
            }
        }
        return rotada;
    }
}
