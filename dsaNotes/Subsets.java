package dsaNotes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> aList = new ArrayList<List<Integer> >();

        for(int i =0; i<(1<< nums.length);i++){
            List<Integer> ai = new ArrayList<Integer>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))> 0){
                    ai.add(nums[j]);
                }
            }
            aList.add(ai);
        }
        }

    }

