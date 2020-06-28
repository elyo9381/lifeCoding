package com.company.OOP;

/*
*  Calculator는 객체이다.
* 객체 안에는 변수와 메소드가 존재한다.
* 반복적인 메소드가 메인문에 존재할때 이를 객체를 사용해서 리팩토링을 할수잇다.
* 객체 타입의 변수를 만들어고 여기에 new 객체를 할당해주는것을 인스턴스라고 한다.
* 객체는 멤버변수 맴버메소드 등등으로 구성되어있다.
* this.는 멤버변수를 가르킬때 사용된다.
* 인스턴스를 통해서 객체의 public메소드 또는 public멤버변수를 접근할수있다.
*
* 그렇다면 클래스와 인스턴스중 어느것이 객체 일까??
* 객체는 클래스를 뜻하기도 하고 인스턴스를 뜻하기도 한다. 상황혹은 문맥에 맞춰서 잘 인지 해야한다.
* 그러므로 정확하게 클래스와 인스턴스의 개념을 탑제하는것이 좋다
*
* 즉 하나의 클래스를 바탕으로 서로 다른 상태를 가진 인스턴스를 만들면 서로 다른 행동을 하게 된다는 것을 알수 있다.
*
* */


// 클래스변수와 인스턴스 변수
/* 클래스멤버변수
    : 인스턴스에 따라서 변하지 않는 값이 필요한 경우
    (이런경우 final을 이용해서 상수로 선언하는것이 바람직)
    : 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은경우
    : 값의 변경 사항을 모든 인스턴스가 공유해야하는 경
* */

// 클래스멤버 메소드, 인스턴스멤버 메소
/*
*   클래스 메소드
*   public static void sum(int left,int right)등으로 static이 붙는다.
*
*   인스턴스 메소드는 클래스멤버에 접근할수있다.
*   클래스 메소드는 인스턴스 멤버에 접근할 수 없다.
* */


//  클래스 변수 -> Static Field
//  인스턴스 변수 -> Non-Static Field
//  final은 상속/변경을 금지하는 규제이다.
//  필드에서의 final은 상수가 변하지 않는 값이라고 배운 기억이 날것이다.
//  상수의 값이 변경되는 것을 규제할 수 있다.
//  final메소드 다른곳에서 클래스, 메소드상속 받을 수 없고 오버라이딩이 불가능한다.
class Calculator{
    static final double PI = 3.14;
    int left, right;

    public Calculator(){

    }

    public Calculator(int left ,int right){
        this.left = left;
        this.right = right;
    }

    // 클래스 메소드
    public static void sum(int left, int right) {
        System.out.println(left+right + " 클래스 메소드");
   }

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

class  SubStract_Cal extends Calculator{

    public SubStract_Cal(int left, int right){
        super(left,right);
        // 하위클래스가 인스턴스가 된다는것은 상위클래스가 미리 인스턴스가 되어야 하위클래스의 인스턴스가 발생될수있다.
    }
    public void Sub(){
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo3 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20,40);
        c2.sum();
        c2.avg();


        // 인스턴스를 통해서도 클래스 멤버변수를 접근할수있다.r
        // 하지만 여러 인스턴스에 적용하려고 할땐 클래스멤버변수에 접근해야한다.
        System.out.println(c1.PI); // 인스턴스 변수 c1.PI
        System.out.println(c2.PI); // 인스턴스 변수 c2.PI
        System.out.println(Calculator.PI); // 클래스변수 PI
        
        // 클래스 메소드, 인스턴스 메소드 
        Calculator.sum(10,20);


        // 상속은 어떻게 진행되는가
        // 하위 클래스가 상위클래스의 constructor를 가져올때 super를 사용하여 가져올수있다.

        SubStract_Cal sub1 = new SubStract_Cal(0,10);
        sub1.sum();
        sub1.setOprands(10,20);
        sub1.sum();
        sub1.Sub();



    }
}