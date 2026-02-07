// Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
// missingChar("kitten", 1) → "ktten"
// missingChar("kitten", 0) → "itten"
// missingChar("kitten", 4) → "kittn"

package CoinBat.Warmup_1;

public class missingChar {
    public static String fmissingChar(String str, int n) {
        char[] letters = str.toCharArray();
        int len = letters.length;
        char[] new_letters = new char[len];

        for(int i = 0; i <  len; i++){
            if(i != n){
                new_letters[i] = letters[i];
            }
        }        
        String new_Str = new String(new_letters); 
        new_Str.trim();
        return new_Str;
    }
    
    //Respuesta Real
    public static String fmissingCharR(String str, int n) {

      String front = str.substring(0, n);
    String back = str.substring(n+1, str.length());
    
    return front + back;
    }

}
