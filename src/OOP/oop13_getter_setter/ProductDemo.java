package OOP.oop13_getter_setter;

public class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Laptop", 80000.0, 2);

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        product.setName("Gaming Laptop");
        product.setPrice(95000.0);
        product.setQuantity(3);

        System.out.println("\nAfter valid update:");

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        // Invalid updates:

        product.setName("");
        product.setPrice(-250000);
        product.setQuantity(-2);

        System.out.println("\nAfter invalid Update:");

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        System.out.println("Total Price: " + product.getTotalPrice());

    }
}
