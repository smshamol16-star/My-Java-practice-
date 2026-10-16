package OOP.oop16_wrapperClasses;

public class AutoboxingUnboxing {

    public static void main(String[] args){

        int number = 100;

        Integer wrapperNumber = number; // ** Autoboxing **

        int primitiveNumber = wrapperNumber; // ** Unboxing **

        System.out.println(wrapperNumber);
        System.out.println(primitiveNumber);
    }
}
