package com.LeetcodeProblem;

public class RotationMatrix {
    public static void main(String[] args){
        int[] num = {1,2,3,4};
        getresult(num);
    }
    static int[][] getresult(int[] num){
        int[] ans = new int[num.length];
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
