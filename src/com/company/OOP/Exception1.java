package com.company.OOP;

import java.io.*;


/*
 *  throws는 다음 실행자에게 책임을 넘기는것이다.
 *  즉 c.run이 Ec클래스의 b.run을 실행하고 Eb클래스의 run메소드를 실행한다.
 *  이러한 순서로 호출스택이 쌓이는데
 *  Eb클래스의 run부터 throws를 통해서 책임을 넘길수가 있다.
 *  Eb클래스의에서 throws를 실행하면 Ec클래스에 책임을 넘긴다.
 *  Ec클래스에서 throws를 실행하면 main클래스로 책임을 넘겨
 *  main에서 예외처리인 try/catch를 사용해야한다.
 * */
class Eb{
    void run() throws FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class Ec{
    void run() throws IOException {
        Eb b = new Eb();
        b.run();
//        try {
//            b.run();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

public class Exception1 {
    public static void main(String[] args) throws IOException {
        Ec c = new Ec();
        try {
            c.run();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
