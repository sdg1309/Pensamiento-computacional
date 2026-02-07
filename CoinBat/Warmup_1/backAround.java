// Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

// backAround("cat") → "tcatt"
// backAround("Hello") → "oHelloo"
// backAround("a") → "aaa"

package CoinBat.Warmup_1;

public class backAround {
    public static String fbackAround(String str) {
        int len = str.length();
        char last = str.charAt(len-1);
        String new_Str = last+str+last;
        return new_Str;
    }

    //Respuesta Real
    public String fbackAroundR(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public static void main(String[] args) {
        System.out.println(fbackAround("cat"));
    }
    
}