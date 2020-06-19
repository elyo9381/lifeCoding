package com.company.Procedural;

public class ArrayDemo {
    public static void main(String[] args) {

        String[] array = {"won", "choi", "kim", "LEE"};

        String[] classGoupe =new String[4];

        for (int i = 0 ; i<4; i++){
            System.out.println(array[i]+ " 상담을 받았습니다.");
        }
        System.out.println(classGoupe.length);


        // for-each
        for (String e: array) {
            System.out.println(e + " 상담을 안받았습니다.");
        }
    }
}
