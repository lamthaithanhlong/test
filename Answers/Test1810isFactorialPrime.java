package saiPackage;

public class Question42isFactorialPrime{
    public static void main(String[] args){
        System.out.println("Is   2 a Factorial Prime : " + isFactorialPrime(2));
        System.out.println("Is   3 a Factorial Prime : " + isFactorialPrime(3));
        System.out.println("Is   5 a Factorial Prime : " + isFactorialPrime(5));
        System.out.println("Is   7 a Factorial Prime : " + isFactorialPrime(7));
        System.out.println("Is   8 a Factorial Prime : " + isFactorialPrime(8));
        System.out.println("Is  11 a Factorial Prime : " + isFactorialPrime(11));
        System.out.println("Is 721 a Factorial Prime : " + isFactorialPrime(721));
    }

    static int isFactorialPrime(int n){

        if (n<2)             return 0; 
        if (isPrime(n) == 0) return 0;
    
        int ret =0;

        for (int i=1; i<n; i++){
            if ( (nFactorial(i) + 1) == n ){
                ret =1;
                break;
            }
        }
        return ret;
    }

    static int nFactorial(int n){

        if (n==0){
            return 1;
        }else{
            return n*nFactorial(n-1);
        }
    }

    static int isPrime(int n){
        int isPrime =1;

        for (int i=2; i<=n/2; i++)
            if (n%i ==0) isPrime =0;
        
        return isPrime;    
    }

}
