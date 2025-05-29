package org.effective.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class LambdaExample {
    private int value = 10;

    private Runnable instanceLambda = () -> {
        System.out.println(value);
    };

    public static void main(String[] args) {
        LambdaExample lambdaExample = new LambdaExample();
        Field[] declaredField = lambdaExample.getClass().getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
        }
    }
}
