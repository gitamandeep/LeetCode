package LeetCode;

public class mountainArray {
    //Find peak value of mountain array
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};
        System.out.println(peakValue(arr));
    }
    static int peakValue(int[] arr){
        int start =0;
        int end = arr.length - 1;

        while(start<end){
            int mid = end +(start-end)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end = mid;
            }

            }
        return start;
        }

    }

