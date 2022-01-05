package dsaNotes;

public class binarySearch {
    /* in binary search we assume a sorted array(increasing order) in case of linear seach we start from index
    0 but in case of B.S we take the middle element if the target value greater than middle element of array then start
    point = middle index +1 and ending point remain same. and if target value is less than middle element then start
    then start point remain same and end point = middle index -1. we repeat this process further until target become the
    middle element. And vise versa for Decreasing Array.
    1= N/2^k
    k = LogN base 2.
     */
    //EXAMPLE:--
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 222;

            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    System.out.println("Index of target element is "+ mid);
                    break;
                }

            }

        }
    }

