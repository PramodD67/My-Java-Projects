package com.pramod;

public class VowelsInString {
    public static void main(String[] args){

        String s = "Pramod";
        int vowels_count =0;
        int consonent_count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.toLowerCase().charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(true);
                vowels_count++;
            }
            else{
                System.out.println(false);
                consonent_count++;
            }
        }
        System.out.println("Vowels Count = "+vowels_count);
        System.out.println("Consonant Count = "+consonent_count);
    }
}
