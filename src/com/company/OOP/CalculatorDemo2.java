package com.company.OOP;
/*
* calculatorDemo1에서는 sum을 하기위해서 변수의 중복을 제거하였다.
* calculatorDemo2에서는 동일한 메소드가 계속 사용되고 있음을 알수있다.
* 동일한 사용은 반복이므로 이것을 줄여야 좋은 코드가 된다.
* 우리는 이를 리팩토링을 통해서 진행하려고 한다. >> 객체를 만들어서
* */
public class CalculatorDemo2 {

    public static void sum(int left, int right){
        System.out.println(left + right);
    }
    public static void avg(int left, int right){

        System.out.println((left + right)/2);
    }
    public static void main(String[] args) {
        int left, right;

        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right);

    }
}
