package com.Akhil;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(java.util.Arrays.toString(arr));
        change(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
