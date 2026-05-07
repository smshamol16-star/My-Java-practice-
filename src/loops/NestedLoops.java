package loops;

public class NestedLoops {
    public static void main(String[]args){


    // Easy:-

        for(int i=1;i<=5;i++ ){

            for (int j=1;j<=i ;j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }


    // Mid:-

        for(int i=1;i<=2;i++){
            for (int j=1;j<=3;j++ ){
                System.out.print(i+" x "+j+" = "+i*j+"\t");
            }
            System.out.println();
        }


    //1st Hard:-

        for(int i = 2;i<=50 ;i++){
            boolean isPrime = true;

            for(int j=2;j<i;j++){
                if ((i%j)==0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(i);
            }
        }


    //2nd Hard:-

        for(int i = 5;i>0;i--){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
