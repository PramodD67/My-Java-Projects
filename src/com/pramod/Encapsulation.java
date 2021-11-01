package com.pramod;

public class Encapsulation {
    private String name ;

    public String getName(){
        return name;
    }

    public void setName(String newName){
       this.name= newName;
    }

}
//New Class

class Myclass{
    public static void main(String[] args){

        Encapsulation en = new Encapsulation();
        en.setName("Pramod");
        System.out.println(en.getName());

    }
}
