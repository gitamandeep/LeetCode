package LeetCode;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int start = 0,end = s.length-1;
        while (start<end){
            swap(s,start,end);
            start++;
            end--;
        }
        System.out.println(s);
    }
    static void swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
