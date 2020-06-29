package com.company.OOP;


/*
*   프로그램이 커지면서 상수가 필요해졌다.
*   enum :  서로 연관된 상수들의 집합이다.
*   즉 바뀌지않는 값들의 집합이다.
*
*
* */

enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");

    private String color;
    // 상수들을 열거한것은 new Fruit() 한것과 같은 의미이다.
    // 그래서 enum의 상수가 호출되면 자동적으로 생성자가 호출되는것이다.

    public String getColor(){
        return this.color;
    }
    Fruit(String color){
        System.out.println("call constructor" + this);
        this.color = color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE
}
public class Enum1 {
    public static void main(String[] args) {

        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, "+Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit.BANANA.getColor());
                break;
        }

        for(Fruit f : Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }
    }
}