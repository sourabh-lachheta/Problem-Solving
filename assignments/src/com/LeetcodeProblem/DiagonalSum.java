package com.LeetcodeProblem;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] nums = {{1,2,3}, {4,5,6}, {1,2,3}};
        getresult(nums);
    }
    static int getresult(int[][] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(i % 2 == 0){
                    int sum = sum + nums[i][j];
                }
            }
        }
    }
}
