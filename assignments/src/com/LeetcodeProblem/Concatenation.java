package com.LeetcodeProblem;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args){
        int[] nums = {1,2,1};
        int[] ans = getconcatenation(nums);
        System.out.print(Arrays.toString(ans));
    }
    static int[] getconcatenation(int[] num){
        int[] ans = new int[2*num.length];
        for(int i = 0; i < num.length; i++){
            ans[i] = num[i];
            ans[num.length + i] = num[i];
        }
        return ans;
    }

}
