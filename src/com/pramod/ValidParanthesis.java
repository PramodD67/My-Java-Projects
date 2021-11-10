package com.pramod;
import java.util.*;
public class ValidParanthesis {

    public static void main(String[] args) {

        String s = "()[]}{";

          /*
         * Step 1: Create a map of opening and closing bracket (key: Open bracket, Val: Close bracket)
         * Step 2: Create a Stack DS of strings
         * Step 3: Add opening elements to stack, If elem is not open bracket, peek into the stack and
                   see if the closing bracket of the peeked elem is what we want to add. If yes, pop
                   that value else, add the elem on top of stack
         */

        HashMap<Character, Character> stringMap = new HashMap<Character, Character>();

        //Add the relation
        stringMap.put('(', ')');
        stringMap.put('{', '}');
        stringMap.put('[', ']');

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            char sign = s.charAt(i);
            if (st.empty() && !stringMap.containsKey(sign)) {
                System.out.println(false);
            }

            if (st.empty()) {
                st.push(sign);
                continue;
            }

            if (stringMap.get(st.peek()) == sign) {
                st.pop();
            } else if (stringMap.containsKey(sign)) {
                st.push(sign);

            } else {
                System.out.println(false);
            }
        }


        if (st.empty()) {
            System.out.println(true);
        } else
            System.out.println(false);

    }
}

/*
class Solution {
    public boolean isValid(String s) {

        /*
         * Step 1: Create a map of opening and closing bracket (key: Open bracket, Val: Close bracket)
         * Step 2: Create a Stack DS of strings
         * Step 3: Add opening elements to stack, If elem is not open bracket, peek into the stack and
                   see if the closing bracket of the peeked elem is what we want to add. If yes, pop
                   that value else, add the elem on top of stack


    HashMap<Character, Character> stringMap = new HashMap<Character, Character>();

//Add the relation
        stringMap.put('(', ')');
                stringMap.put('{', '}');
                stringMap.put('[', ']');

                Stack<Character> stack = new Stack<Character>();

        //Loop through the string and construct stack
        for(int i = 0; i < s.length(); i++){

        char bracket = s.charAt(i);

        // Case 1: Stack is empty and the value added is an ending bracket, then fail fast since
        // it would never be possible to match that parenthesis
        if (stack.empty() && !stringMap.containsKey(bracket))
        return false;

        // Case 2: Stack is empty and the value being added is opening bracket, add it. No other checks
        // necessary
        if (stack.empty()) {
        stack.push(bracket);
        continue;
        }

        /*
         * Case 3: Stack is not empty (NOTE: the stack should only ever contain opening brackets.)
         * A: Peek the top element and see if element we are adding is the closing bracket for the peeked element,
         * if yes, pop the stack
         * B: If not, check if the element we are adding is a closing bracket. If this case happens, then it means that
         * there parenthesis is wrong, fail here. Else add the opening bracket to stack

        if(stringMap.get(stack.peek()) == bracket)
        stack.pop();
        else {
        if(stringMap.containsKey(bracket))
        stack.push(bracket);
        else
        return false;
        }
        }

        if (stack.empty())
        return true;
        else
        return false;




        }
        }

        */