/*
Two integers are defined to be factor equal, if they have the same number of factors. For example, integers 10 and 33 are factor equal because, 10 has four factors: 1, 2, 5, 10 and 33 also has four factors: 1, 3, 11, 33. On the other hand, 9 and 10 are not factor equal since 9 has only three factors: 1, 3, 9 and 10 has four factors: 1, 2, 5, 10.
Write a function named factorEqual(int n, int m) that returns 1 if n and m are factor equal and 0 otherwise. The signature of the function is
int factorEqual(int n, int m)

*/
package saiPackage;

public class Test1810FactorEqual {
    public static void main(String[] args){
        System.out.println("10, 33 : " + factorEqual(10, 33));
        System.out.println("09, 10 : " + factorEqual( 9, 10));
    }   

    static int factorEqual(int n, int m){
        int factor_count_n =0;
        int factor_count_m =0;
        int ret            =0;

        for(int i=1; i<=n; i++)
            if(n%i ==0) factor_count_n++;

        for(int i=1; i<=m; i++)
            if(m%i ==0) factor_count_m++;

        if (factor_count_n ==factor_count_m) ret =1;  
        return ret;
    }
}
