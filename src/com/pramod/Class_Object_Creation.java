package com.pramod;

public class Class_Object_Creation {
    int x = 5;
    int y = 10;

    public static void main(String[] args){

        //To create an object, specify class name followed by object name & use keyword "new".

        Class_Object_Creation object1 = new Class_Object_Creation();
        System.out.println(object1.x);

        Class_Object_Creation object2 = new Class_Object_Creation();
        System.out.println(object2.y - object1.x);

        //Using Multiple Classes: U can create an object in one class & access it in another class.
        //To access the object of another class, Simply create a object of that class and a dot.

        // Here we access the object "a" of Main.java class

        Main obj = new Main();
        System.out.println(obj.a);

        //You can also perform operations on that object
        System.out.println(obj.a- object1.x);


        //Let us access object of StringMethods class in this package.

        StringMethods obj2 = new StringMethods();
        System.out.println("Hello I'm "+obj2.myname); //It is accessable because 'myname' is  public.

        //You can modify the variable's value.
        StringMethods obj3 = new StringMethods();
        obj3.myname = "Pramod D";
        System.out.println("My First Name and Last Name is :"+obj3.myname);

        //However , If u dont want the ability to override(modify) existing value, Declare the attribute as final in that class.
        StringMethods obj4 = new StringMethods();
        //obj4.var = "Mango";  It is not accessable bcz it is  declared as final in StringMethods class.






    }
}
