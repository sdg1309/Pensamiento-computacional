// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
// diff21(19) → 2
// diff21(10) → 11
// diff21(21) → 0

package CoinBat.Warmup_1;

public class diff21 {
    public static int fdiff21(int n) {
        if(n < -21){
            return -1 * (21 - (n*-1))*2;
        }
        else if(n < 21){
            return 21 - n;
        }
        else{
            return -1 * (21 - n)*2;
        }
    }

    //Respuesta Real
    public int fdiff21R(int n) {
        if (n <= 21) {
            return 21 - n;
        } 
        else {
            return (n - 21) * 2;
        }
    }
}
