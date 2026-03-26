import java.util.Scanner;

public class recorrerArrayNuevo {
    public static void readArray(int[] arrayList) {
        for (int j = 0; j < arrayList.length; j++) {

            System.out.println(arrayList[j]);

        }
    }

    public static void saveArray(int[] arrayList) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < arrayList.length; j++) {

            arrayList[j] = sc.nextInt();

        }
        sc.close();
    }

    public static void main(String[] args) {
        int[] array = new int[5];

        saveArray(array);

        readArray(array);
    }
}
