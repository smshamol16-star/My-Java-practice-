package Generics;

public class Display <T>{

    T item;

    public Display(T item){
        this.item = item;
    }
    public T getValue(){
        return item;
    }

    public void showValue(){
        System.out.println(item);
    }
}
