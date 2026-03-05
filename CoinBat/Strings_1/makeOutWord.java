// Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

// makeOutWord("<<>>", "Yay") → "<<Yay>>"
// makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
// makeOutWord("[[]]", "word") → "[[word]]"

package CoinBat.Strings_1;

public class makeOutWord {
    public static String fmakeOutWord(String out, String word) {
        String str1 = out.substring(0, 2);
        String str2 = out.substring(2, 4);

        return str1 + word + str2;
    }

    public static void main(String[] args) {
        System.out.println(fmakeOutWord("<<>>", "yay"));
    }
}
