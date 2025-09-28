package com.LeetcodeProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = getresult(nums,index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getresult(int[] nums, int[] index){

        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for(int i =0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}