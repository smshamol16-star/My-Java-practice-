package Collections.HashMaps;

import java.util.HashMap;

public class ProductStockManager {

    public static void main (String []args){

        HashMap<String, Integer> products = new HashMap<>();

        products.put("Laptop", 10);
        products.put("Mouse", 25);
        products.put("Keyboard", 15);
        products.put("Monitor", 8);

        System.out.println("Laptop: "+ products.get("Laptop"));

        if (products.containsKey("Mouse")) {
            System.out.println("Is Mouse available? -> Yes");
        }
        else {
            System.out.println("Is Mouse available? -> No");
        }
        products.put("Keyboard", 20);

        products.remove("Monitor");

        System.out.println("\n======= Products =======");
        for (String key : products.keySet()){
            System.out.println("product: "+ key + " Quantity: " +products.get(key));
        }
    }
}
