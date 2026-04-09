package Talleres.Taller_5;

public class T502_minimoBuscado {
    public static int minimoBuscado(int[][] arr) {
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        return min;
    }
}
