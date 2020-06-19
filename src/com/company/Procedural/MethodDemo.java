package com.company.Procedural;

public class MethodDemo {

    public static void m_method() {
        System.out.println("메소트 테스트");
        System.out.println("노 생성자!\n"
        );
    }

    public static String f_m(String a) {
        String ac = a + " 사람새끼아니다.";

        return ac;
    }

    public static void s_m(String a, String b) {
        System.out.println(a + "는 동물새끼이고\n" + b + "는 사람새끼이다." );
    }

    public static void main(String[] args) {
        m_method();
        String ac = f_m("나의 맥북은");
        System.out.println(ac);
        s_m("건뎅이","원요");
    }
}
