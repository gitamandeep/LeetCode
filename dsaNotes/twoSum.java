package dsaNotes;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
//not valid is array contain same element

        int[] numbers = {-1,0};
        int target = -1;
        int[] ans = new int[2];
        int i = 0;
        boolean found = false;
        for ( i = 0; i < numbers.length; i++) {
            int search = target - numbers[i];
            int result =binarySearch(numbers,search);
            if(result!= -1){
                ans[1] = result+1;
                break;
            }
        }
        ans[0] = i+1;
        System.out.println(Arrays.toString(ans));

    }
    static int binarySearch(int[] numbers,int search){
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (search > numbers[mid]) {
                start = mid + 1;
            } else if (search < numbers[mid]) {
                end = mid - 1;
            } else {
              return mid;
            }
        }
        return -1;
    }
}
