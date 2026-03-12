package Talleres.Taller_4;

import java.util.Scanner;

public class SubTextoMejorado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int start = sc.nextInt();
        int end = sc.nextInt() + 1;

        sc.close();

        if (str.length() < end) {
            System.out.println("Error");
        }

        else if (start >= end) {
            System.out.println("Error2");
        }

        else {
            System.out.println(str.substring(start, end));
        }

    }

}
