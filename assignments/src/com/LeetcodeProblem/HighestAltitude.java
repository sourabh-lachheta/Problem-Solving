package com.LeetcodeProblem;

public class HighestAltitude {
    public static void main(String[] args){
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = getresult(gain);
        System.out.print(ans);
    }
    static int getresult(int[] gain){

        int max = 0, sum = 0;

        for (int j : gain) {
            sum = sum + j;
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
