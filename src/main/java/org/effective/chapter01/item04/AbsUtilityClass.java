package org.effective.chapter01.item04;

public abstract class AbsUtilityClass {

    public AbsUtilityClass() {
        System.out.println("UntilityClass.Constructor");
    }

    public static String hello(){
        return "hello";
    }

    public static void main(String[] args){
        String hello = AbsUtilityClass.hello();
        //AbsUtilityClass utilityClass = new AbsUtilityClass();
        //utilityClass.hello(); // 문법적인 문제가 없지만 IDE에서 지원하지 않는다.

    }
}
