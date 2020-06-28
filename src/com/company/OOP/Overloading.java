package com.company.OOP;

class test2{
    int left, right;
    int third = 0;

    public void setOprands1(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands1(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class Overloading {

    // 인자 혹은 파라미터의 이름을 다르게 한다면 오버로딩 할수없다.
    // 리턴타입이 다르면 오버로딩 할수없다.
    // 같은이름, 같은 인자, 파라미터를 받는 메소드이면 여러개의 같은 이름을 정의하는것이 오버로
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}


    public static void main(String[] args) {

        test2 c1 = new test2();
        c1.setOprands1(10, 20);
        c1.sum();
        c1.avg();
        c1.setOprands1(10, 20, 30);
        c1.sum();
        c1.avg();

        Overloading od = new Overloading();
        od.A();
        od.A(1);
        od.A("coding everybody");

    }
}
