package saiPackage.dev;

public class Test1810Meera1 {
    public static void main(String[] args){
        System.out.println("{7, 6, 0, 10, 1}   : " + isMeera(new int[]{7, 6, 0, 10, 1}));
        System.out.println("{6, 10, 1}         : " + isMeera(new int[]{6, 10, 1}));
        System.out.println("{7, 6, 10}         : " + isMeera(new int[]{7, 6, 10}));
        System.out.println("{6, 10, 0}         : " + isMeera(new int[]{6, 10, 0}));
        System.out.println("{3, 7, 0, 8, 0, 5} : " + isMeera(new int[]{3, 7, 0, 8, 0, 5}));
    }

    static int isMeera(int[] a){
        int ret =0;

        boolean hasZero  =false;
        boolean hasPrime =false;

        for(int i=0; i<a.length; i++){
            if (a[i] ==0)          hasZero  =true;
            if (isPrime(a[i]) ==1) hasPrime =true;
        }

        if(hasZero  && hasPrime) ret =1;
        if(!hasZero && !hasPrime) ret =1;

        return ret;
    }

    static int isPrime(int n){
        int ret =1;

        if (n<2) return 0;

        for(int i=2; i<=n/2; i++){
            if (n%i ==0) { ret =0; break; }
        }
        return ret;
    }
}

/*
. A Meera array is an array that contains the value 0 if and only if it contains a prime number. The array {7, 6, 0, 10, 1} is a Meera array because it contains a prime number (7) and also contains a 0. The array {6, 10, 1} is a Meera array because it contains no prime number and also contains no 0.
The array {7, 6, 10} is not a Meera array because it contains a prime number (7) but does not contain a 0. The array {6, 10, 0} is not a Meera array because it contains a 0 but does not contain a prime number.
It is okay if a Meera array contains more than one value 0 and more than one prime, so the array {3, 7, 0, 8, 0, 5} is a Meera array (3, 5 and 7 are the primes and there are two zeros.).
Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise.
You may assume the existence of a function named isPrime that returns 1 if its argument is a prime and returns 0
otherwise. You do not have to write isPrime, you can just call it. If you are programming in Java or C#, the function signature is
int isMeera(int [ ] a)
*/

