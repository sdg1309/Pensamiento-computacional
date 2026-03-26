package Talleres.Taller_4;

import java.util.Scanner;

public class T402_DeFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1;

        sc.close();

        if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
            str1 = str.substring(2);
            System.out.println(str1);
        }

        else if (str.charAt(0) != 'a') {
            str1 = str.substring(1);
            System.out.println(str1);
        }

        else if (str.charAt(1) != 'b') {
            str1 = str.substring(0, 1) + str.substring(2);
            System.out.println(str1);
        }

        else {
            System.out.println(str);
        }
    }
}