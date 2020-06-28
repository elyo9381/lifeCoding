package com.company.OOP;



/*
* 로우레벨에서 컴파일 하는법
*
*
* */
public class CalculatorDemo {


    public static void sum(int left, int right){
        System.out.println(left + right);
    }
    public static void main(String[] args) {
    //        System.out.println("10 + 20");
    //        System.out.println("20 + 40");

        // 건강한 코드는 중복의 제거이다.
        // 여기에서는 더하기가 중복되고 있다
        // 중복을 제거하기위해 가장 좋은 방법은 메소드사용이다.
        // 이것을 리팩토링 이라고 한다.
        sum(10,20);
        sum(20,40);

    }
}
