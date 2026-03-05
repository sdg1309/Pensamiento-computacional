package Talleres.Taller_4;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();

        sc.close();

        System.out.println(str.length());
        System.out.println(str.indexOf("a"));
    }
}
