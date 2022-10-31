
/*
2. An array is defined to be a Nice array if the sum of the primes in the array is equal to the first element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9, 11 4, 6} is a Nice array because 3, 7, 11 are the primes in the array and they sum to 21 which is the first element of the array. {13, 4, 4,4, 4} is also a Nice array because the sum of the primes is 13 which is also the first element. Other Nice arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {8, 5, -5, 5, 3} is not a Nice array because the sum of the primes is 5+5+3 = 13 but the first element of the array is 8. Note that -5 is not a prime because prime numbers are positive.
Write a function named isNiceArray that returns 1 if its integer array argument is a Nice array. Otherwise it returns 0.
The function signature is int isNiceArray (int[ ] a)
*/

package saiPackage;

public class Test1810NiceArray1 {
    public static void main(String[] args){
        System.out.println("{21, 3, 7, 9, 11 4, 6} : " + isNiceArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println("{13, 4, 4,4, 4}        : " + isNiceArray(new int[]{13, 4, 4,4, 4}));
        System.out.println("{10, 5, 5}             : " + isNiceArray(new int[]{10, 5, 5}));
        System.out.println("{0, 6, 8, 20}          : " + isNiceArray(new int[]{0, 6, 8, 20}));
        System.out.println("{3}                    : " + isNiceArray(new int[]{3}));
        System.out.println("{8, 5, -5, 5, 3}       : " + isNiceArray(new int[]{8, 5, -5, 5, 3}));
    }

    static int isNiceArray(int[] a){
        int     ret      =1;
        int     total    =0;
        boolean hasPrime =false;

        for(int i=0; i<a.length; i++){
            if(isPrime(a[i])==1){
                hasPrime =true;
                total +=a[i];
            }
        } 

        if (a[0] ==0 && hasPrime ==true) ret =0;
        if (a[0] !=total)                ret =0;

        return ret;
    }

    static int isPrime(int n){
        int ret =1;

        if (n<2) return 0; 

        for(int i=2; i<=n/2; i++)
            if(n%i ==0) { ret =0; break; }

        return ret;
    }

}

