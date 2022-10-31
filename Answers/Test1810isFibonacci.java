package saiPackage;

public class Question49isFibonacci{
    public static void main(String[] args){
        System.out.println("Is  1 Fibonacci : " + isFibonacci(1));
        System.out.println("Is  2 Fibonacci : " + isFibonacci(2));
        System.out.println("Is  3 Fibonacci : " + isFibonacci(3));
        System.out.println("Is  4 Fibonacci : " + isFibonacci(4));
        System.out.println("Is  7 Fibonacci : " + isFibonacci(7));
        System.out.println("Is 13 Fibonacci : " + isFibonacci(13));
        System.out.println("Is 27 Fibonacci : " + isFibonacci(27));

    }

    static int isFibonacci(int n){
        int first  =1;
        int second =1;
        int third  =first + second;

        while (third <= n){
            first  = second;
            second = third;
            third  = first + second;
        }

        if (second == n) return 1;
        else             return 0;
    }

}
