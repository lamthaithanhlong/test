package saiPackage;

public class Question60IsComplete{
    public static void main(String[] args){
        System.out.println ("{36, -28}                        : " + isComplete(new int[]{36, -28} ));
        System.out.println ("{36, 28}                         : " + isComplete(new int[]{36, 28}));
        System.out.println ("{4}                              : " + isComplete(new int[]{4}));
        System.out.println ("{3, 2, 1, 1, 5, 6}               : " + isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println ("{3, 7, 23, 13, 107, -99, 97, 81} : " + isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));

    }

    static int isComplete(int[] a){
        int there_is_even        =0;
        int there_is_prefectsqrt =0;
        int there_is_eight       =0;
        int ret                  =0;

        if (a.length < 2) return 0;

        for (int i=0; i<a.length; i++){

            // there is even 
            if (a[i]%2 ==0) there_is_even =1;  

            // there is perfect square 
            if (isPrefectSquare(a[i]) == 1) there_is_prefectsqrt =1;

            // If there is x+y = 8
            for (int j=i+1; j<a.length; j++){
                if ((a[i] + a[j]) == 8) there_is_eight =1;
            }

            if (there_is_even == 1 && there_is_prefectsqrt == 1 && there_is_eight == 1){
                ret = 1; break;
            }
        }

        return ret;
    }

    static int isPrefectSquare(int n){
        int isPrefectSqrt =0;

        for (int i=0; i<=n/2; i++){
            if (n == i*i) isPrefectSqrt =1;
        } 
        return isPrefectSqrt;
    }
}
