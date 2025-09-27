package com.LeetcodeProblem;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        int[] result = getresult(nums);
        System.out.print(Arrays.toString(result));

    }
    static int[] getresult(int[] nums){
        int x = 0;
        int[] ans = new int[nums.length];
        while(x != nums.length){
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[x] > nums[i] && x != i){
                    count++;
                }
            }
            ans[x] = count;
            x++;
        }
        return ans;
    }
}
