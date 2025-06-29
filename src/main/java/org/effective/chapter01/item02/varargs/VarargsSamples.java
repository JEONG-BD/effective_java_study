package org.effective.chapter01.item02.varargs;

import java.util.Arrays;

public class VarargsSamples {
    // 자바 5에서 도입 가변인수 오직 한 개!
    public void printNumber(int ... numbers){
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsSamples samples = new VarargsSamples();
        samples.printNumber(5, 10);
    }
}
