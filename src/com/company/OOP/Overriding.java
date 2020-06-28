package com.company.OOP;

/*
* 메소드 오버라이딩
* : 부모클래스의 메소드가 존재하고 상속받는 자식클래스가 존재할때
*   부모클래스의 메소드(sum)를 사용하지않고
*   자식클래스의 메소드(sum)를 다시 정의하여 사용하는것이 오버라이딩이다.
*
*   우선순위는 오버라이딩된 자식클래스의 메소드이다.
*
*   <오버라이딩의 제약사항>
*   부모메소드의 타입과 자식 메소드의 타입이 다르면 오버라이딩을 할수없다.
*   이름또한 같아야한다.
*   메개변수또한 같아야한다.
*   정확하게 일치해야한다.
*
*   - 메소드의 이름
*   - 메소드의 매개변수의 숫자와 데이터 타입 그리고 순서
*   - 메소드의 리턴 타입
*
*
*   부모와 자식간의 메소드가 중복될때
*   자식의 메소드를 변경하는데
*   return super.avg();
*   로 변경하여 사용할수있다.
*   반환타입이 있다면 마지막에 return 을 실행하면 되고
*   반환값이 없으면 그냥 super.메소드이름(); 을 반환하면된다.
**/
class test1 {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return (this.left + this.right) / 2;
    }
}

class SubstractionableCalculator extends test1 {

    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }

    public int avg() {
        int a = 1;
        a += super.avg();
        return a/2;
    }
}

public class Overriding {

    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println(c1.avg());
    }
}
