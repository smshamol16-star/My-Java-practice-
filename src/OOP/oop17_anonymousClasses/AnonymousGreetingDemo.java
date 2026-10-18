package OOP.oop17_anonymousClasses;

public class AnonymousGreetingDemo {

    public static  void main (String[] args){

        Greeting greeting = new Greeting(){
            @Override
            void sayHello(){
                System.out.println("Hello welcome to Java.");
                System.out.println("I am learning anonymous classes.");
            }
        };
        greeting.sayHello();
    }
}
