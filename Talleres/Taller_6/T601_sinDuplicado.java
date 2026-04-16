package Talleres.Taller_6;

import java.util.ArrayList;
import java.util.Scanner;

public class T601_sinDuplicado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();


        int num = sc.nextInt();

        for(int i = 0; i != num; i++){
            list.add(sc.nextInt());
        }

        sc.close();

        list.sort(null);
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; 
                }
            }
        }   
    
        System.out.println(list);
    }
}
