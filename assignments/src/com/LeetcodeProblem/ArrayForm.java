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


    static List<Integer> getresult(int[] A, int K){
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList<>();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }



}
