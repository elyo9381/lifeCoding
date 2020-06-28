package com.company.OOP;

/*
    인터페이스의 중요한 측면
    규제


    // 형식지정, 포맷지정 같은 느낌이다.
    인터페이스 : - 어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면
              그 객체는 반드시 인터페이스의 메소드를 구현해야한다.
              - 인터페이스는 하위 클래스에 특정한 메소드가 반드시
              존재하도록 강제하는것이다.

    커뮤니케이션을 원할하게 할때 인터페이스를 사용된다.
    인터페이스를 사용하게 되면 초기 어떤 함수 또는 어떤 변수를 쓸지 정할수있고
    각각의 개발자들은 이를 기반으로 구현을 진행할수있다.
*/

interface I{
    public void z();
}

class AA implements I{
    public void z() {}
}

public class Interface {

    public static void main(String[] args) {

    }
}
