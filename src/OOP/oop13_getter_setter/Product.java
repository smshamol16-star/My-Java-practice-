package OOP.oop13_getter_setter;

public class Product {

    private String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity){
        setName(name);
        setPrice(price);
        setQuantity(quantity);

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        if(name != null && !name.isBlank()){
            this.name = name;
        }
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

    public void setQuantity(int quantity){
        if(quantity >= 0){
            this.quantity = quantity;
        }
    }

    public double getTotalPrice () {
        return price * quantity;
    }
}
