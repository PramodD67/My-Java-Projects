package com.pramod;

public class CountPrimes {

    public static int countPrimes(int n) {

         int d=0;
         String m="not Prime";
        for(int i=2;i<n/2;i++){
            if(n%i!=0){
             m="Prime";
             break;
            }
            else {
                m="Not Prime";
                break;
            }
        }
        System.out.println(m);
        return d;
    }

    public static void main(String[] args){
        countPrimes(9);

    }
}
