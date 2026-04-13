package Talleres.Taller_6;

import java.util.ArrayList;
import java.util.Scanner;

public class T603_Ascendente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();


        int num = sc.nextInt();

        for(int i = 0; i != num; i++){
            list.add(sc.nextInt());
        }

        sc.close();

        list.sort(null);
        list.removeIf(n -> n < 0);

        System.out.println(list);
    }
}
