package org.effective.chapter01.item01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;
import me.whiteship.hello.ChineseHelloService;

public class HelloServiceFactory {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> first = loader.findFirst();
        first.ifPresent(h -> {
            h.hello();
        });

        HelloService chineseHelloService = new ChineseHelloService();
        System.out.println(chineseHelloService.hello());

        //Class<?> aClass = Class.forName("me.whiteship.hello.ChineseHelloService");
        //Constructor<?> constructor = aClass.getConstructor();
        //HelloService helloService = (HelloService) constructor.newInstance();

    }



    public static HelloService of(String lang){
        if (lang.equals("ko")){
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
