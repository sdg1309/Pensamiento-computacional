// Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

// firstLast6([1, 2, 6]) → true
// firstLast6([6, 1, 2, 3]) → true
// firstLast6([13, 6, 1, 2, 3]) → false

package CoinBat.Array_1;

public class firstLast6 {
    public static boolean ffirstLast6(int[] nums) {
        int lastpos = nums.length - 1;

        if (nums[0] == 6 || nums[lastpos] == 6) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 6 };

        System.out.println(ffirstLast6(nums));
    }

}
