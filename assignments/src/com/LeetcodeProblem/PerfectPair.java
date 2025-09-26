package com.LeetcodeProblem;

public class PerfectPair {
    public static void main(String[] args){
        int[] num = {1,1,1,1};
        int ans = getresult(num);
        System.out.print(ans);
    }
    static int getresult(int[] num){
        int count = 0,i = 0, j = 0;
        while(i < num.length){
                for(j = 0 ; j < num.length; j++){
                    if(num[i] == num[j] && i < j){
                        count++;
                    }
                }
            i++;
        }
        return count;
    }
}
