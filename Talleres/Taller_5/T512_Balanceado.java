package Talleres.Taller_5;

public class T512_Balanceado {
public static boolean balancear(int[] a){
        int len = a.length;
        int mit = len/2;

        int mit1 = 0; int mit2 = 0;

        for(int i = 0; i < mit; i++){
            mit1 = mit1 + a[i];
        }
        for(int i = mit+1; i < len; i++){
            mit2 = mit2 + a[i];
        }

        if(mit1 == mit2){
            return true;
        }

        else{
            return false;
        }
    }
}
