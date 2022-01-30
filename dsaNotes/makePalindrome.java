package dsaNotes;

public class makePalindrome {
    public static void main(String[] args) {
        int[] arr = {6,1,3,7};
        int count =0,i =0,j= arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                arr[i+1]+=arr[i];
                i++;
                count++;
            }
             else{
                arr[j-1]+=arr[j];
                j--;
                count++;
            }
        }
        System.out.println(count);
    }
}
