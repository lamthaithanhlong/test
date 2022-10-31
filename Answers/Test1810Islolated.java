package saiPackage;

public class Test1810Islolated {
    public static void main(String[] args){
        System.out.println("Is 2 Isolated : " + isIsolated( 2));
        System.out.println("Is 3 Isolated : " + isIsolated( 3));
        System.out.println("Is 8 Isolated : " + isIsolated( 8));
        System.out.println("Is 9 Isolated : " + isIsolated( 9));
        System.out.println("Is 14 Isolated : " + isIsolated( 14));
        System.out.println("Is 15 Isolated : " + isIsolated( 15));
        System.out.println("Is 24 Isolated : " + isIsolated( 24));
        System.out.println("Is 28 Isolated : " + isIsolated( 28));
        System.out.println("Is 29 Isolated : " + isIsolated( 29));
        System.out.println("Is 63 Isolated : " + isIsolated( 63));
        System.out.println("Is 64 Isolated : " + isIsolated( 64));

    }

    static int isIsolated(long n){
        if (n<1 || n>2097151) return -1;

        long square =n*n;
        long cube   =n*n*n;

        int[] arrSqrt = new int[]{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, };
        int[] arrCube = new int[]{ -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, };

        int remainder =0;
        int found     =0;

        while (square > 0){
            remainder          = (int)square%10; 
            arrSqrt[remainder] = remainder;
            square             = square/10; 
        }

        while (cube > 0){
            remainder          = (int)cube%10; 
            arrCube[remainder] = remainder;
            cube               = cube/10; 
        }

        for (int i=0; i<arrSqrt.length; i++){
            if (arrSqrt[i] == arrCube[i]) found =1;
        }

        if (found ==1) return 0;
        else return 1;
    }

}
