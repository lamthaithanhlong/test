package saiPackage;

public class Question56NPrimeable{
    public static void main(String[] args){
        System.out.println("{5, 15, 27}          ,2 : " + isNPrimeable(new int[]{5, 15, 27}          ,2));
        System.out.println("{5, 15, 27}          ,3 : " + isNPrimeable(new int[]{5, 15, 27}          ,3));
        System.out.println("{5, 15, 26}          ,2 : " + isNPrimeable(new int[]{5, 15, 26}          ,2));
        System.out.println("{1, 1, 1, 1, 1, 1, 1},4 : " + isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1},4));
        System.out.println("{}                   ,2 : " + isNPrimeable(new int[]{}                   ,2));
    }

    static int isNPrimeable(int[] a, int n){ 
        if (a.length ==0)
            if (checkPrime(n) == 0) return 0;

        for (int i=0; i<a.length; i++){
            if (checkPrime(a[i]+n) == 0) return 0;
        }

        return 1;
    }

    static int checkPrime(int n){
        if (n<2) return 0;

        for (int i=2; i<=n/2; i++)
            if (n%i == 0) return 0;

        return 1;

    }

}

