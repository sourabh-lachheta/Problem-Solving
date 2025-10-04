package com.LeetcodeProblem;

public class EvenDigitNo {
    public static void main(String[] args){
        int[] digits = {555,901,482,1771};
        int ans = getresult(digits);
        System.out.println(ans);
    }
    static int getresult(int[] digits){
        int count = 0;
        for(int i = 0; i < digits.length; i++){
            if(getnum(digits[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    static int getnum(int a){
        int count = 0;
          while( a != 0) {
              int n = a % 10;
              a = a / 10;
              count++;
          }
            return count;
    }
}
