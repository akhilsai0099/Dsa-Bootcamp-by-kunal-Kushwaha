package com.Akhil;


import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Sumof2 {
    public static void main(String[] args) {

        int target = 6;
        int[] nums = {3, 2,4};

        System.out.println(Arrays.toString(sumOf2Optimized(nums, target)));


    }

    static int[] sumOf2Optimized(int[] nums , int target)
    {
        int first = 0, second = nums.length -1;
        int[] temparr = new int[nums.length] ;
        for (int i = 0; i < nums.length; i++) {
         temparr[i] = nums[i];
        }

        Arrays.sort(nums);
        int[] ans = new int[2];
        while (first<second)
        {
            if (nums[first] + nums[second] == target ) {
                ans[0] = first;
                ans[1] = second;

                break;
            }
            else if (nums[first] + nums[second] < target)
            {
                first++;
            }
            else {
                second--;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[ans[0]] == temparr[i]){
                ans[0] = i;
                i++;

            }
            else if (nums[ans[1]] == temparr[i]){
                ans[1] =i;
                i++;

            }
        }

        return ans;
    }

//    static void sumOf2(int[] arr, int key){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == key) {
//                    System.out.println(i + " " + j);
//                    return;
//                }
//            }
//        }
//    }

//    static int[] sumOf2Optimized(int[] nums , int target){
//            int l =0, r = nums.length -1;
//            int[] ans = {0,0};
//            Arrays.sort(nums);
//            System.out.println(nums);
//
//            while (l<r){
//                if (nums[l]+ nums[r] > target){
//                    r --;
//                }
//                else if (nums[l] + nums[r]< target){
//                    l ++;
//                }
//                else if (nums[l] + nums[r] == target){
//                    ans[0] = l;
//                    ans[1] = r;
//                    return ans;
//                }
//            }
//            return ans;
//    }

}
