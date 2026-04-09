package Talleres.Taller_5;

public class T504_transpuesta {
    public static void transpuesta(int[][] arr) {
        int[][] transp = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                transp[j][i] = arr[i][j];

            }
        }

        for (int i = 0; i < transp.length; i++) {
            for (int j = 0; j < transp[i].length; j++) {
                System.out.print(transp[i][j] + " ");
            }
            System.out.println();
        }

    }
}
