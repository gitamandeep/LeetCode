package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        int len = digits.length - 1;
        while (len >= 0) {
            if (digits[len] != 9) {
                digits[len]++;
          //      return digits;
            }
            else {
                Arrays.fill(digits, len--, digits.length, 0);
            }
        }
        int[] arr = new int[digits.length+1];
        Arrays.fill(arr, 0);
        arr[0] = ++digits[0];
       // return arr;
    }
}