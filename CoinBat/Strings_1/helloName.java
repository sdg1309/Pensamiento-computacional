// Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


// helloName("Bob") → "Hello Bob!"
// helloName("Alice") → "Hello Alice!"
// helloName("X") → "Hello X!"


package CoinBat.Strings_1;

public class helloName {
    public static String fhelloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(fhelloName("Santiago"));
    }
}
