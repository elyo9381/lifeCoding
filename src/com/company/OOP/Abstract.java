package com.company.OOP;
abstract class A{
   public abstract int b();
   /*
     abstract가 붙어 있는 추상메소드는
     반드시 오버라이등을 통해서 로직을 만들어서 사용해야한다.
   */
    // 본체가 있는 메소드는 abstract 키워드를 가질수없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가>>아닌 메소드가 존재할수있다.

   // 추상클래스에는 일반메소드를 구성요소로 가지고 있을수잇다.
   public void d(){
       System.out.println("world");
   }
}

class B extends A{
    public int b(){
        return 1;
    }
}


public class Abstract {
    public static void main(String[] args) {
        //A obj = new A();
        B obj = new B();
    }
}
