package com.pramod;
import java.util.*;
import java.util.Arrays;

public class RotateArray {
    /*
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */
    public static   void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        int p=0;
        for(int j=nums.length-k;j<nums.length;j++){
            temp[p]=nums[j];
            p++;
        }
        int y=0;
        for(int i=p;i<nums.length;i++){
            temp[p]=nums[y];
            y++;
            p++;
        }

            System.out.print(Arrays.toString(temp));

    }
    public static void main(String[] agrs){
        int[] r= {1,2,3,4,5,6,7};

      rotate(r,3);


    }
}