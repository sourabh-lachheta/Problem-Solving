
/* build array form permutation */

package com.LeetcodeProblem;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        int[] ans = buildarray(nums);
        System.out.print(Arrays.toString(ans));
    }
    static int[] buildarray(int[] num){
        int[] ans = new int[num.length];
        for(int i = 0; i < num.length; i++){
            ans[i] = num[num[i]];
        }
        return ans;
    }
}
