// Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

// comboString("Hello", "hi") → "hiHellohi"
// comboString("hi", "Hello") → "hiHellohi"
// comboString("aaa", "b") → "baaab"

package CoinBat.Strings_1;

public class comboString {
    public static String fcomboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }

        else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println(fcomboString("aaa", "b"));
    }

}
