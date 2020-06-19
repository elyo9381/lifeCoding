package com.company.Procedural;

public class OperatorDemo {
    public static void main(String[] args) {
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println("one" == "two");
        System.out.println("one" == "one");


        System.out.println(1!=2);

        System.out.println("");
        String a = "Hello world";
        String b=  new String("Hello world");

        // 문자열 비교 할때 a == b로 비교 할수없다.
        // equals()를 이용하여 비교 할수있다.
        System.out.println( a == b);
        System.out.println( a.equals(b));
    }
}
