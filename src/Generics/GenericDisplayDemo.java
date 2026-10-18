package Generics;

public class GenericDisplayDemo {

    public static void main (String[]args){

        Display<String> display1 = new Display("Shamol");
        Display<Integer> display2 = new Display(21);
        Display<Double> display3 = new Display(4.17);

        display1.showValue();
        display2.showValue();
        display3.showValue();

    }
}
