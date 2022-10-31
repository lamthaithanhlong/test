package saiPackage.dev;

public class Test1810PascalNumber {
    public static void main(String[] args){
        System.out.println("Is 06 Pascal : " + isPascal(6));
        System.out.println("Is 07 Pascal : " + isPascal(7));
        System.out.println("Is 10 Pascal : " + isPascal(10));
        System.out.println("Is 15 Pascal : " + isPascal(15));
        System.out.println("Is 16 Pascal : " + isPascal(16));
    }

    static int isPascal(int n){
        int ret     =0;
        int num     =0;
        int counter =1;

        while (num<=n){
            if(num ==n) {ret =1; break;}
            num +=counter;
            counter++;
        }

        return ret;
    }
}

/*
1. A Pascal number is a number that is the sum of the integers from 1 to j for some j. For example 6 is a Pascal number because 6 = 1 + 2 + 3. Here j is 3. Another Pascal number is 15 because 15 = 1 + 2 + 3 + 4 + 5. An example of a number that is not a Pascal number is 7 because it falls between the Pascal numbers 6 and 10.
Write a function named isPascal that returns 1 if its integer argument is a Pascal number, otherwise it returns 0.
The signature of the function is int isPascal (int n)
*/
