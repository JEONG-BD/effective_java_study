package org.effective.chapter01.item06;

public class Strings {
    public static void main(String[] args) {
        String hello = "hello";
        /*
        * 자바에서 한 번 만들어진 문자열 리터럴은 JVM 내의 String Constant Pool에 캐싱되어 재사용
        * 문자열 상수 풀(String Constant Pool) 또는 interned string pool
        * 문자열은 불변(immutable)**이기 때문에 안전하게 공유
        * 동일한 문자열을 계속해서 새로 만들지 않고 하나만 만들어서 재사용하면 메모리와 성능 모두 이점
        **/
        String hello2 = new String("hello"); // 권장 하지 않는다.
        String hello3 = "hello";

        System.out.println(hello == hello2);
        System.out.println(hello.equals(hello2));
        System.out.println(hello2 == hello3);
    }
}
