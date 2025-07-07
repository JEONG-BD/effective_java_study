package org.effective.chapter01.item01;

import java.util.Arrays;

public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;
    private OrderStatus orderStatus;

    //public Order(Product product, boolean prime) {
    //    this.prime = prime;
    //    this.urgent = urgent;
    //}
    //
    //public Order(Product product, boolean urgent) {
    //    this.product = product;
    //    this.urgent = urgent;
    //}
    //public Order(boolean urgent, Product product) {
    //    this.product = product;
    //    this.urgent = urgent;
    //}

    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return  order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return  order;
    }

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
        Order order = new Order();
        //if (order.orderStatus.equals(OrderStatus.DELIVERING)) {
        //    System.out.println(" delivered");
        //}
        if (order.orderStatus == OrderStatus.DELIVERING) {
            System.out.println(" delivered");
        }

        OrderStatus orderStatus1 = OrderStatus.DELIVERING;
        orderStatus1.getNumber();
    }
}
