package com.company.OOP;

// 나만의 Exception 만들기 !
//class DivideException extends Exception {// checked exception
class DivideException extends RuntimeException {// unchecked exception
    public int left;
    public int right;

    DivideException(){
        super();
    }
    DivideException(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator_Except3{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.",this.left, this.right);
        }
        System.out.print(this.left/this.right);
    }
}
public class Exception3 {
    public static void main(String[] args) {
        Calculator_Except3 c1 = new Calculator_Except3();
        c1.setOprands(10, 0);
        c1.divide();
    }
}