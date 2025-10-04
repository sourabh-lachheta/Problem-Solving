package com.LeetcodeProblem;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] nums = {{1}};
        int ans = getresult(nums);
        System.out.println(ans);
    }
    static int getresult(int[][] nums){
        int start = 0, sum = 0;
        int end = nums.length - 1;
        while(start <= end){
             sum = sum + nums[start][start] + nums[end][start] + nums[end][end] + nums[start][end] ;
            if(start == end){
                sum = sum - (nums[end][end] + nums[end][start] + nums[start][end]);
            }

            start++;
            end--;
        }
        return sum;
        
    }
}
