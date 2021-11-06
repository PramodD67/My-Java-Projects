package com.pramod;

public class PhrasePalindrome {

    public static void main(String[] args){
        //String n="A man, a plan, a canal: Panama";
        String n="race a car";



            String[] m=   n.trim().split("[,:\\s]");



            for(int i=0;i< m.length;i++){
                System.out.print(m[i]);
            }
            String[] temp=new String[m.length];

            for(int j= m.length-1;j>=0;j--){
                for(int i=0;i<m.length-1;i++){
                    temp[i] = m[j];
                }
            }

        for(int i=0;i< m.length;i++){
            System.out.println(temp[i]);
        }

           /* for (int y=0;y< m.length-1;y++){
                if(temp[y]==m[y]){
                    System.out.println("\nPalindrome");
                    break;
                }else{
                    System.out.println("\nNot Palindrome");
                    break;
                }
            } */

        }


    }
