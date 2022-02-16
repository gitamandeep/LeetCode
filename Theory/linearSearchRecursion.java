package Theory;

import java.util.ArrayList;
//given an array return all index of target
public class linearSearchRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,8};
        int target = 4;
        System.out.println(findAllIndex(arr,target,0));

    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
