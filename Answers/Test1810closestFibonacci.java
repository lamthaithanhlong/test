package saiPackage;

public class Question46closestFibonacci{
    public static void main(String[] args){
        printFibonacci(15); 
        System.out.println ("Closest Fibonacci of  7 is : " + closestFibonacci(7));
        System.out.println ("Closest Fibonacci of 13 is : " + closestFibonacci(13));
        System.out.println ("Closest Fibonacci of 33 is : " + closestFibonacci(33));
        System.out.println ("Closest Fibonacci of 34 is : " + closestFibonacci(34));
        System.out.println ("Closest Fibonacci of 77 is : " + closestFibonacci(77));

    }

    static int closestFibonacci(int n){

        if (n<1) return 0;

        int first  =1;
        int second =1;
        int third  =first+second;
        int ret =0; 

        while (third <= n){
            first  = second;
            second = third;
            third  = first + second;
        }

//        if ((third - n) < (n - second))
        if ((third - n)==0 )
            ret = third;
        else
            ret = second;

        return ret;
    }

    static void printFibonacci(int num){
        int first  = 1;
        int second = 1;
        int third  = 0;

        System.out.print("{1, 1");

        for (int i=3; i<=num; i++){

            third = first + second; 
            System.out.print(", " + third);

            first = second;
            second = third;
        }
        System.out.print("}\n");
    }

}
