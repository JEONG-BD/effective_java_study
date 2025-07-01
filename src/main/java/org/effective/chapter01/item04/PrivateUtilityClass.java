package org.effective.chapter01.item04;

public class PrivateUtilityClass {

    /*
    * 이 클래스는 인스턴스를 만들 수 없다.
    */
    private PrivateUtilityClass() {
        throw  new AssertionError();
    }

    public static String hello(){
        return "hello";
    }

    public static void main(String[] args){
        String hello = PrivateUtilityClass.hello();
        // private 생성자라고 내부에서 생성 가능 하다.
        PrivateUtilityClass privateUtilityClass = new PrivateUtilityClass();


    }
}
