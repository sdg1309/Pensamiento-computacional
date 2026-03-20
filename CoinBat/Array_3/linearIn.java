package CoinBat.Array_3;

public class linearIn {
    public static boolean flinearIn(int[] outer, int[] inner) {
        int o = 0;
        int i = 0;

        while (o < outer.length && i < inner.length) {
            if (outer[o] == inner[i]) {
                i++;
            }
            o++;
        }

        return i == inner.length;
    }

    public static void main(String[] args) {
        int[] outer = { 1, 2, 4, 6 };
        int[] inner = { 2, 4 };
        System.out.println(flinearIn(outer, inner));

    }
}
