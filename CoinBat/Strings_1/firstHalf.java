// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

// firstHalf("WooHoo") → "Woo"
// firstHalf("HelloThere") → "Hello"
// firstHalf("abcdef") → "abc"

package CoinBat.Strings_1;

public class firstHalf {
    public static String ffirstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        System.out.println(ffirstHalf("hola"));
    }
}
