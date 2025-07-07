package org.effective.chapter01.item01;

public class HelloServiceMain {
    public static void main(String[] args) {
        HelloService ko = HelloServiceFactory.of("english");
        System.out.println("ko = " + ko.hello());

    }
}
