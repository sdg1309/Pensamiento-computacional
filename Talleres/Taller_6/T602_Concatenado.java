package Talleres.Taller_6;

import java.util.ArrayList;
import java.util.Scanner;

public class T602_Concatenado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();


        int num1 = sc.nextInt();

        for(int i = 0; i != num1; i++){
            list1.add(sc.nextInt());
        }

        int num2 = sc.nextInt();

        for(int i = 0; i != num2; i++){
            list2.add(sc.nextInt());
        }

        sc.close();

        list1.addAll(list2);

        list1.sort(null);
    
        System.out.println(list1);  
    }
}