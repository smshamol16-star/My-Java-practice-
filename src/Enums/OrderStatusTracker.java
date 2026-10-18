package Enums;

public class OrderStatusTracker {

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.PROCESSING;

        System.out.println("Current Order Status: " + status);

        if (status == OrderStatus.PENDING) {
            System.out.println("Your order is waiting to be processed.");
        }
        else if (status == OrderStatus.PROCESSING) {
            System.out.println("Your order is being processed.");
        }
        else if (status == OrderStatus.SHIPPED) {
            System.out.println("Your order has been shipped.");
        }
        else if (status == OrderStatus.DELIVERED) {
            System.out.println("Your order has been delivered.");
        }
        else if (status == OrderStatus.CANCELLED) {
            System.out.println("Your order has been cancelled.");
        }
    }
}