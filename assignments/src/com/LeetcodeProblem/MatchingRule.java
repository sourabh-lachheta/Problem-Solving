package com.LeetcodeProblem;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingRule {
    public static void main(String[] args){
        List<List<String>> list = new ArrayList<>();
        String ruleKey = "color";
        String ruleValue = "silver";
        list.add(Arrays.asList("phone","blue","pixel"));
        list.add(Arrays.asList("computer","silver","lenovo"));
        list.add(Arrays.asList("phone","gold","iphone"));
        int ans = getresult(list, ruleKey, ruleValue);
        System.out.print(ans);

    }
    static int getresult(List<List<String>> items, String ruleKey, String ruleValue){
        int check;
        switch (ruleKey) {
            case "type":
                check = 0;
                break;
            case "color":
                check = 1;
                break;
            default:
                check = 2;
                break;
        }

        int count = 0;
        for(List<String> item : items) {
            if(item.get(check).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
