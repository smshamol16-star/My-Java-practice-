package OOP.oop15_composition;

public class SmartphoneDemo {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone(
                "Samsung",
                "Galaxy S25",
                "Lithium-Ion",
                5000
        );

        phone.showPhoneInfo();

        phone.setBrand("Apple");
        phone.setModel("iPhone 17");

        System.out.println("\nAfter valid update:");

        phone.showPhoneInfo();

        phone.setBrand("");
        phone.setModel("");

        System.out.println("\nAfter invalid update:");

        phone.showPhoneInfo();

    }
}