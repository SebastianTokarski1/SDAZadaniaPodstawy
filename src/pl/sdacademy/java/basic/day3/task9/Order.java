package pl.sdacademy.java.basic.day3.task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;
    private int currentItemsInOrder = 0;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
        //currentItemsInOrder = 0;
    }

    public boolean addItem(OrderItem orderItem) {
        int tmp = 0;
        if(!orderItem.isCorrect()) {
            System.out.println("Item is incorrect");
            return false;
        }
        if(currentItemsInOrder >= maxOrderItem) {
            System.out.println("Order is full");
            return false;
        }
        orderItems[currentItemsInOrder] = orderItem;
        currentItemsInOrder++;
        return true;
    }

//    public void addItem(OrderItem orderItem) {
//        int tmp = 0;
//        if(!orderItem.isCorrect()) {
//            System.out.println("Item is incorrect");
//        } else if(currentItemsInOrder >= maxOrderItem) {
//            System.out.println("Order is full");
//        } else {
//            orderItems[currentItemsInOrder] = orderItem;
//            currentItemsInOrder++;
//        }
//    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                totalAmount += orderItem.getAmount();
            }
        }
        return totalAmount;
    }

    public int getItemsCount() {
        int total = 0;
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                total += orderItem.getQuantity();
            }
        }
        return total;
    }

    public void print() {
        for (OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                orderItem.print();
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }

}
