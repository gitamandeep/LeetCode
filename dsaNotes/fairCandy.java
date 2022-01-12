package dsaNotes;

public class fairCandy {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 2};
        int[] bobSizes = {2, 3};
        int equalValuearray = (arraySum(aliceSizes) + arraySum(bobSizes)) / 2;
        for(int i =0;i<aliceSizes.length-1;i++){
            int target = equalValuearray - aliceSizes[i];
            int found = binarySearch(bobSizes,target);
            if(found!=0){
                System.out.println(found);
            }
        }
    }

    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return arr[mid];
            }
        }
        return -1;
    }

}
