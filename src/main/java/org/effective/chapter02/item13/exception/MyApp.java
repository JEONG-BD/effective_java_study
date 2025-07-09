package org.effective.chapter02.item13.exception;

public class MyApp {

    public void hello(){
        System.out.println("Hello");
        throw new MyException();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.hello();
    }
}
