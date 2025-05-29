package org.effective.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi(){

    }
    class InnerClass {
        public void hello(){
            OuterClass.this.hi();
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);
        outerClass.printConstructor();
    }

    private void printConstructor(){
        Field[] declaredField = InnerClass.class.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println("field.getName() = " + field.getName());
            System.out.println("field.getType() = " + field.getType());
        }
    }
}
