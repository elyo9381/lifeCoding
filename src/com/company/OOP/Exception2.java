package com.company.OOP;

import java.io.IOException;

class Calculator_Except{
    int left, right;
    public void setOprands(int left, int right) throws IllegalAccessException {
        if( right == 0){
            throw new IllegalAccessException("두번째인자는 0을 허용할수없다.");
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

class E{
    // checked exception 이고 이것은 runtimeException이다.
    // runtimeException을 부모이고 이것을 상속받으면 throw를 통해서
    // 실행하면된다.
    void throwArithmeticExcetion(){
        throw new ArithmeticException();
    }

    // runtimeException을 상속받지 않고 Excetion을 상속받는
    // 클래스들은 unCheckedException이다.
    // 이들은 Exception발생시 throws를 통해 책임 넘기거나
    // try/catch를 통해서 에러를 표기해야한다.
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException {
        throw new IOException();
    }
}


public class Exception2 {
    public static void main(String[] args) {
        Calculator_Except c1 = new Calculator_Except();
        try {
            c1.setOprands(10, 0);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        c1.divide();
    }
}
