package com.LeetcodeProblem;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args){
        int[] num = {1,2,3,4};
        int[] result = runningsum(num);
        System.out.print(Arrays.toString(result));
    }
    static int[] runningsum(int[] nums){
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
             sum = sum + nums[i];
             ans[i] = sum;
        }
        return ans;
    }

}
