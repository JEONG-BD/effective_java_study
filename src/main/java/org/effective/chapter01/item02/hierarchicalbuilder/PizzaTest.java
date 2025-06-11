package org.effective.chapter01.item02.hierarchicalbuilder;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addToping(Pizza.Topping.SAUSAGE)
                .addToping(Pizza.Topping.ONION).build();
        Calzone calZone = new Calzone.Builder().addToping(Pizza.Topping.HAM).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calZone);
    }
}
