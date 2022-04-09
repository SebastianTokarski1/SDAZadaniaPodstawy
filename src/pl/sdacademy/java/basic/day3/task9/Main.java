package pl.sdacademy.java.basic.day3.task9;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("Cukier", 3, 4);
        OrderItem orderItem2 = new OrderItem("Mleko", 2, 3);
        OrderItem orderItem3 = new OrderItem("Chleb", 5, 2);
        OrderItem orderItem4 = new OrderItem("Jaja", 10, 1.5);

        Order order = new Order(4);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        //order.addItem(orderItem4); //order is full
        order.print();
    }
}
