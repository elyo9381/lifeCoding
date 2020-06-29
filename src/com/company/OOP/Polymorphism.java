package com.company.OOP;

/*
*    다형성
*    : 다형성이란 하나의 메소드나 클래스가 있을때
*      이것들이 다양한 방법으로 동작하는것을 의미한다.
*
*     다형성을 통해서 메소드와 클래스를 보는 시야를 넓히는것이 중요하다.
*
* */

class O{
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}

class Ac{
    public String x(){return "A.X";}
}
class Bc extends Ac{
    public String x(){return "B.x";}
    public String y(){return "Y";}
}

class Bc2 extends Ac{
    public String x() {return "B2.x";}
}

public class Polymorphism {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);;
        o.a("one");

        Ac obj = new Bc();
        Ac obj2 = new Bc2();
        obj.x();
        obj2.x(); // Bc2클래스를 인스턴스로 생성하기 떄문에 Bc2의 x()의 메소드를 불러온다.
        // 위와같이 인스턴스에 다른 클래스를 할당하면 해당하지 않는 Bc().y는
        // 사용하지 못한다. 하지만 클래스 Ac의 x()메소드는 사용가능하다.
        // 그리고 Bc에서 x()메소드에 대해서 오버라이딩 하였다면
        // x()메소드를 사용할수있다.
    }
}
