package com.LeetcodeProblem;

import java.util.Arrays;

public class Candies {
    public static void main(String[] args){
        int extra = 1;
        int[] candies = {4,2,1,1,2};
        boolean[] result = getresult(candies, extra);
        System.out.print(Arrays.toString(result));
    }
    static boolean[] getresult(int[] candies, int extra){
        int max = 0;
        boolean[] ans = new boolean[candies.length];
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }

        for(int i = 0; i < candies.length; i++){
            ans[i] = max <= candies[i] + extra;
        }
        return ans;
    }
}
