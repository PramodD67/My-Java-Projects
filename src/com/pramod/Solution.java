package com.pramod;

import java.util.*;
public class Solution {
    public static void main(String args[]) {
        isValid("()[]{}");

    }

    public static void isValid(String s) {
        HashMap<String, String> stringMap = new HashMap<>();

        stringMap.put("{", "}");
        stringMap.put("(", ")");
        stringMap.put("[", "]");


   /* public static void main(String[] args){
      int[] arr= {1,3,5,2,5,2,3,1,8,9,0,7};
      int[] newarr= new int[arr.length];
      int count=0;
      for(int i=0;i< arr.length;i++) {
          for (int j = i+1; j < arr.length ; j++) {
              if (arr[i] == arr[j]) {
                  System.out.println(arr[j]);
                  newarr[i]=arr[j];
                  count++;

              }

          }
      } System.out.println("Duplicate number count : "+count);
        int l=0;
      for(int k=0;k<arr.length;k++){
          if(arr[k]==newarr[k]){

          }
      }

    }  */


        Stack<Character> st = new Stack<Character>();
//Loop through the string and construct stack
        for (int i = 0; i < s.length(); i++) {

            char bracket = s.charAt(i);

            // Case 1: Stack is empty and the value added is an ending bracket, then fail fast since
            // it would never be possible to match that parenthesis
            if (st.empty() && !stringMap.containsKey(bracket))
                System.out.println(false);

            // Case 2: Stack is empty and the value being added is opening bracket, add it. No other checks
            // necessary
            if (st.empty()) {
                st.push(bracket);
                continue;
            }

            /*
             * Case 3: Stack is not empty (NOTE: the stack should only ever contain opening brackets.)
             * A: Peek the top element and see if element we are adding is the closing bracket for the peeked element,
             * if yes, pop the stack
             * B: If not, check if the element we are adding is a closing bracket. If this case happens, then it means that
             * there parenthesis is wrong, fail here. Else add the opening bracket to stack
             */


            else {
                if (stringMap.containsKey(bracket))
                    st.push(bracket);
                else
                    System.out.println(false);
            }
        }

        if (st.empty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
