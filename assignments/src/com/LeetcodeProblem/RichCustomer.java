package com.LeetcodeProblem;

public class RichCustomer {
    public static void main(String[] args){
        int[][] accounts = {{1,5},{7,3}, {3,5}};
        int ans = getrichcustomer(accounts);
        System.out.print(ans);
    }
    static int getrichcustomer(int[][] acc){
        int max = 0, sum = 0, n = acc.length, i = 0;
        while(i != n){
            sum = 0;
            for(int j = 0; j < acc[i].length; j++){
                sum = sum + acc[i][j];
            }
            if(max < sum){
                max = sum;
            }
            i++;
        }
        return max;
    }
}
