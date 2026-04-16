package Talleres.Taller_5;

public class T510_espiralMatriz {
    public static int[] recorrerEspiral(int[][] matriz){

        int n = matriz.length;
        int m = matriz[0].length;

        int[] resultado = new int[n * m];
        int k = 0;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                resultado[k++] = matriz[top][j];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                resultado[k++] = matriz[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    resultado[k++] = matriz[bottom][j];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    resultado[k++] = matriz[i][left];
                }
                left++;
            }
        }

        return resultado;
    }
}