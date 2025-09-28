package com.LeetcodeProblem;

public class Pangram {
    public static void main(String[] args){
        String name = "sourabh";
        boolean ans = getresult(name);
        System.out.print(ans);
    }
    static boolean getresult(String name){
                boolean ans = true;
                for(char c = 'a'; c <= 'z'; c++){
                    if(!name.contains(String.valueOf(c))){
                        ans = false;
                        break;
                    }
                }
                return ans;
    }
}
