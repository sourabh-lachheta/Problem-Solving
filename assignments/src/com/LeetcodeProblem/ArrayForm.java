package com.LeetcodeProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args){
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> ans = getresult(nums, k);
        System.out.println(ans);
    }


    static List<Integer> getresult(int[] nums, int k){

        int s = (int) Math.pow(10, nums.length-1);

        int c = 0;
        for(int i = 0; i < nums.length; i++){
            c = c + (nums[i] * s);
            if(nums[i] != 0) {
                s = s / 10;
            }
            if(i == nums.length -1){
                c = c + k;
            }
        }
        System.out.println(c);
         return getAns(c);

    }

    static List<Integer> getAns(int c){
        List<Integer> list = new ArrayList<>();
        while(c > 0){
            int a = c % 10;
            list.add(a);
            c = c /10;
        }
        Collections.reverse(list);
        return list;
    }

}
