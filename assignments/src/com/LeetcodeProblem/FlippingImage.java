package com.LeetcodeProblem;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args){
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] ans = getresult(image);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] getresult(int[][] image){
        for(int i = 0; i < image.length; i++){
            int start = 0;
            int end = image.length - 1;
            while(start < end ){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }



        }
        return getInvert(image);
    }
    static int[][] getInvert(int[][] image){
        int x = 0;
        while(x < image.length){
            for(int i = 0; i < image.length; i++){
                if(image[x][i] == 0){
                    image[x][i] = 1;
                    continue;
                }
                if(image[x][i] == 1){
                    image[x][i] = 0;
                }

            }
            x++;
        }
        return image;

    }
}
