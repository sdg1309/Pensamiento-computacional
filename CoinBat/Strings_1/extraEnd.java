// Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

// extraEnd("Hello") → "lololo"
// extraEnd("ab") → "ababab"
// extraEnd("Hi") → "HiHiHi"

package CoinBat.Strings_1;

public class extraEnd {
    public static String fextraEnd(String str) {
        int len = str.length();

        String str1 = str.substring(len - 2, len);

        return str1 + str1 + str1;
    }

    public static void main(String[] args) {
        System.out.println(fextraEnd("Hello"));
    }

}
