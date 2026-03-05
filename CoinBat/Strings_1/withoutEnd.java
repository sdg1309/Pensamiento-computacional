// Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

// withoutEnd("Hello") → "ell"
// withoutEnd("java") → "av"
// withoutEnd("coding") → "odin"

package CoinBat.Strings_1;

public class withoutEnd {
    public static String fwithoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(fwithoutEnd("Hello"));
    }
}
