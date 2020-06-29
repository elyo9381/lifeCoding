package com.company.OOP;


/*
*   @@ 모든 클래스의 조상은 Object이다.
*   toString : 객체를 문자로 표현하는 메소드이다.
*
*
*   equals : string 혹은 객체를 비교할때는 (Object obj) 인자로
*   받아와서 비교하고 obj를 string형식으로 형변환 시켜줘여힌다.
*   직적 만들때는 이렇게 하면되지만
*   실무에서는 ide에서 제공하는 equals기능을 사용하도록하
*
*   finalize : 객체가 소멸될 때 호출되기로 약속된 메소드이다.
*   finalize메소드보가 가비지컬렉션을 주목하자
*
*   가비지 컬렉션 :  데이터를 램에서 제거할수있는 방법
*   자바에서는 자동적으로 램을 삭제해주는 기능이있는데 이를
*   가비지 컬렉션이라고 한다.
*
*   변수를 사용하는곳이 더이상없다면 변수와 변수에 담겨있는
*   인스턴스는 더이상 메모리에 머물고 있을 필요가없는 것이다.
*   자바는 이를 감지하고 자동으로 쓰짖 않는 데이터를 삭제한다.
*
*   clone : 객체를 복제하는것이다.
*   객체가 복잡해지면 복제를 어떻게 하는가 ?
*   자바 버춸 머신에 알려줘야하는데 implements Cloneable을 통해서
*   알려줘야한다. 복제가능한 클래스라고 알려주는것이다. (구분자역할)
*
*
*
* */



class Student implements Cloneable{
    String name;
    Student(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Object1 {

    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        try {
            Student s2 = (Student)s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}

