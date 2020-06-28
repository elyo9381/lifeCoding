package com.company.OOP;

// 생성자는 초기화 작업을 진행한다.
// public 클래스이름(){} 으로 진행하게 된다.

// 생성자는 값을 반환하지 않는다.
// 생성자의 이름은 클래스의 이름과 동일하다.
public class Constructor {

    public static void main(String[] args) {

        // 인스턴스를 생성하면서 동시에 생성자를 지정할수있다.
        Calculator c1 = new Calculator(10,20);
        c1.sum();
        c1.avg();
    }
}
