package com.company.Procedural;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//      Scanner는 입력을 받는 메소드이다
//      이것은 scanf, cin과 같은기능을 하는것 같다

//        일반적인 입력받는상황(1번입력받고 실행후 종료하는 입력)
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i * 1000);
        sc.close();

//      프로그램을 종료시키지 않고 계속적으로 입력을 받는방법
        Scanner sc1 = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println(sc1.nextInt()* 1000);
        }
        sc.close();

//      파일을 통해서 입력받기
        try {
            File file = new File("out.txt");
            Scanner sc2 = new Scanner(file);
            while(sc.hasNextInt()){
                System.out.println(sc2.nextInt()*1000);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
