package com.LeetcodeProblem;

public class MaxPopulation {
    public static void main(String[] args){
       int[][] year = {{1940, 1950},{1950, 1960}};
       getresult(year);
    }
    static int getresult(int[][] year){

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
