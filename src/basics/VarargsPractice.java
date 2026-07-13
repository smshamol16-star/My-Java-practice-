package basics;

public class VarargsPractice {
    public static void main(String[]args){


        System.out.println(sum(5,5,5));
        System.out.println(largest(2,5,9,2,10));
        printStudents("siam","Rahim","karim");
    }
    // Easy
    static int sum(int... numbers){
        int sum = 0 ;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

// Easy
    static int largest(int... numbers){

        int largest = numbers[0];

        for (int number : numbers){
            if (number>largest){
                largest = number;
            }
        }
        return largest;
    }

// Mid
    static void printStudents(String... names){
        for(int i = 0; i < names.length; i++){

            System.out.println((i + 1) + ". " + names[i]);
        }

    }

}