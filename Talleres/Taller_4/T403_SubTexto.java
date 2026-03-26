package Talleres.Taller_4;

import java.util.Scanner;

public class T403_SubTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        System.out.println(str.substring(num1, num2 + 1));
    }
}
