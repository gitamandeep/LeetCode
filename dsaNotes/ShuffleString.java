package dsaNotes;

import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        char[] ch = s.toCharArray();
        for(int i =0;i< indices.length;i++){
            while(indices[i]!= i){
                swap1(ch,i,indices[i]);
                swap2(indices,i,indices[i] );
            }
        }
        String ans = new String(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println(ans);


    }
    static void swap2(int[] arr,int a, int b){
        int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
    static void swap1(char[] arr,int a , int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

