package Talleres.Taller_5;

public class T511_malaSuerte {
    public static boolean detectorDeMalaSuerte(int[] a){
        boolean con1=false, con3=false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                con1 = true;
            }
            if(a[i] == 3){
                con3 = true;
            }

            else if(a[i] == 13){
                return true;
            }
        }  

            if(con1 == true && con3 == true){
                return true;
            }

            else{
                return false;
            }
    }
}
