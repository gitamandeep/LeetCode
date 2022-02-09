package LeetCode;

import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int count = intervals.length;
        for(int i =0;i< intervals.length-1;i++){
            if(intervals[i][1]>=intervals[i+1][0]){
                count--;
            }
        }
        int [][] ans = new int[count][2];
        int j =0;
        for(int i =0;i< ans.length-1;i++){
            if(j >=intervals.length){
                ans[i][0] = intervals[intervals.length-1][0];
                ans[i][1] = intervals[intervals.length-1][1];
            }
            if(intervals[j][1]>=intervals[j+1][0]){
                ans[i][0] = intervals[j][0];
                ans[i][1] = intervals[j+1][1];
                j= j+2;
            }

            else{
                ans[i][0] = intervals[j][0];
                ans[i][1] = intervals[j][1];
                j++;
            }
        }

    }
}
