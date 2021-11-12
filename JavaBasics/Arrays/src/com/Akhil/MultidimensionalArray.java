package com.Akhil;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr2d = {   {1,2,3},
                            {2,3},
                            {3,4,5}
                        };

        for (int[] element : arr2d){
            System.out.println(Arrays.toString(element));
        }
    }
}
