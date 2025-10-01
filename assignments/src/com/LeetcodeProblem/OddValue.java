package com.LeetcodeProblem;

import java.util.Arrays;

public class OddValue {
    public static void main(String[] args){
        int m = 2;
        int n = 3;
        int[][] indices ={{0,1},{1,1}};

      int ans = oddCells(m, n,indices);
      System.out.print(Arrays.deepToString(ans));
    }


        static int oddCells(int m, int n, int[][] indices) {
            int[] row = new int[m];
            int[] col = new int[n];

            // Step 1: Count increments for each row and column
            for (int[] index : indices) {
                row[index[0]]++;
                col[index[1]]++;
            }

            // Step 2: Count cells with odd values
            int oddCount = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int value = row[i] + col[j];
                    if (value % 2 != 0) {
                        oddCount++;
                    }
                }
            }

            return oddCount;
        }
    }


