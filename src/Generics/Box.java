package Generics;

public class Box <T>{

    T something;

    public void setSomething(T something){
        this.something = something;
    }

    public T getSomething(){
        return something;
    }
}
