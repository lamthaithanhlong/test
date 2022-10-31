package saiPackage;

public class Test1810FactorTwoCount {
    public static void main(String[] args){
        System.out.println("Factor Two Count of 48 is : " + factorTwoCount(48));

    }

    static int factorTwoCount(int n){
        int count =0;
        int num   =n;

        boolean loop =true;

        while(loop){
            if(num%2 ==0) count++;
            else          loop =false;
            num /=2;
        }

        return count;
    }
}

/*
. Write a function named factorTwoCount that returns the number of times that 2 divides the argument.
For example, factorTwoCount(48) returns 4 because 48/2 = 24
  
24/2 = 12
12/2 = 6
6/2 = 3
2 does not divide 3 evenly.
Another example: factorTwoCount(27) returns 0 because 2 does not divide 27.
The function signature is int factorTwoCount(int n);

*/
