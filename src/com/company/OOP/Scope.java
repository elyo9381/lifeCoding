package com.company.OOP;


// 메소드안에서는 변수는 독립적인 유효범위를 갖는다.
// 파라미터 혹은 전역변수로 설정되어있을경우 공유 변수 (유효범위)를 갖는다.

class C3{
    int v = 10;


    // 인스턴스 메소드 사용시 this는 인스턴스 변수를 참조한다.
    // 지역변수를 사용하지 않는다.
    void m(){
        int v = 20;
        System.out.println(this.v);
    }
}

public class Scope {
        int left;
        public static void sum(){
            int i = 0;
        }

    public static void main(String[] args) {
            for(int i = 0 ; i<5; i++){
                sum();
                System.out.println(i);
            }

            // 인스턴스의 메소드를 사용한다.
            C3 c = new C3();
            c.m();
    }
}
