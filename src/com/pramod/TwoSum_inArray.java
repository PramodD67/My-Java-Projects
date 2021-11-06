package com.pramod;

public class TwoSum_inArray {
    /* Input: nums = [2,7,11,15], target = 9
       Output: [0,1]
       Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target =9;
        int[] res=new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){

                    res[0]= i;
                    res[1]= j;
                   break;
                }
            }
        }
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
