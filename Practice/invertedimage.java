package com.company;

import java.util.Arrays;

public class invertedimage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};

        int[][] res = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                res[i][j] = image[i][image[i].length - 1 - j];
                if (res[i][j] == 1)
                    res[i][j] = 0;
                else
                    res[i][j] = 1;
            }
        }
        for(int i=0;i< res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }
}