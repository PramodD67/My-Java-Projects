package com.pramod;

import java.util.HashSet;

public class RemovingDuplicateItems_inArray {

    public static void main(String[] agrs){
        int[] nums = {1,1,2};
        HashSet<Integer> h = new HashSet<>();

        for(int i=0;i<=nums.length-1;i++){
            h.add(nums[i]);
        }
        System.out.println("K = "+h.size() + " "+ h);

    }


    }


