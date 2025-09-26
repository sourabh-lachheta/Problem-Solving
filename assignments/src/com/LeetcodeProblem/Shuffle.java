package com.LeetcodeProblem;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args){
        int n = 4;
        int[] num = {1,2,3,4,4,3,2,1};
        int[] result = getshuffle(num, n);
        System.out.print(Arrays.toString(result));
    }
    static int[] getshuffle(int[] num, int n){
        int x = 0;
        int[] ans = new int[num.length];
        for(int i = 0; i < num.length; i = i+2){
            ans[i] = num[x];
            ans[i + 1] = num[n + x];
            x++;
        }
        return ans;
    }
}
