package com.LeetcodeProblem;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] nums = {{1,2,3}, {4,5,6}, {1,2,3}};
        getresult(nums);
    }
    static int getresult(int[][] nums){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = row[i] + col[j];
                if (value % 2 != 0) {
                    oddCount++;
                }
            }
    }
}
