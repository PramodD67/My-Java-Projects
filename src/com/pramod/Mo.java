package com.pramod;

public class Mo {
    public static void main(String[] args){
        int[] arr = {0,1,0,5,12};
                plusOne(arr);
    }


        public static int[] plusOne(int[] digits) {

            int[] res= new int[digits.length];

            String m="";
            for(int i=0;i<res.length;i++){
                m=m+String.valueOf(digits[i]);
            }


            int r=Integer.parseInt(m);
            r++;
            String y= String.valueOf(r);
            for(int j=0;j<res.length;j++){
                res[j]= y.charAt(j);
            }
            for(int k=0;k<res.length;k++){
              System.out.println(res[k]);
            }
            return res;
        }

}
