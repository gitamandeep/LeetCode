package LeetCode;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums ={3,0,1};
        cyclicSort(nums);
        for(int index =0; index< nums.length;index++){
            if (index != nums[index]){
                System.out.println(index);
            }
        }

            System.out.println(nums.length);


    }

    static void cyclicSort(int arr[]){
        int i =0;
        while(i<arr.length){
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]  ){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
    }
     static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
     }

}
