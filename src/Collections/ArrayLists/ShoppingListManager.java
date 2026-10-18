package Collections.ArrayLists;

import java.util.ArrayList;

public class ShoppingListManager {

    public static void main(String[] args){

        ArrayList<String> items = new ArrayList<>();

        items.add("Milk");
        items.add("Bread");
        items.add("Eggs");
        items.add("Rice");
        items.add("Sugar");

        System.out.println("Total Item: "+ items.size());

        System.out.println("Item of index 2: "+ items.get(2));

        System.out.println("Changed "+ items.get(3)+" to Potato.");
        items.set(3, "Potato");

        if (items.contains("Milk")){
            System.out.println("Is Milk available? -> Yes");
        }
        else {
            System.out.println("Is Milk available? -> No");
        }
        items.remove("Sugar");

        System.out.println("====== Items Available ======");
        for (String item : items){
            System.out.println(item);
        }
    }
}
