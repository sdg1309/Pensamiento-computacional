import java.util.Scanner;

public class multi_dim {
    // Usar para mas eficiencia: HashMap o LinkedList
    // HashMap: https://www.w3schools.com/java/java_ref_hashmap.asp
    // LinkedList: https://www.w3schools.com/java/java_ref_linkedlist.asp

    public static void impArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(" " + array[i][j] + " ");

            }

            System.out.println();
        }
    }

    public static void saveArray(int[][] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                array[i][j] = sc.nextInt();

            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        // Una array de 2 dimensiones:
        // int [][] #nombre = new int [filas] [Columnas]

        // Ejemplo y recorrido:

        int[][] array2 = new int[3][3];

        saveArray(array2);

        impArray(array2);

    }
}
