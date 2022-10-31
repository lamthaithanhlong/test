package saiPackage;



public class Question78TwinPrime{
    public static void main(String[] args){
        System.out.println("Is  5 Twin Prime : " + isTwinPrime(5));
        System.out.println("Is  7 Twin Prime : " + isTwinPrime(7));
        System.out.println("Is 53 Twin Prime : " + isTwinPrime(53));
        System.out.println("Is  9 Twin Prime : " + isTwinPrime(9));
    }

   static int isTwinPrime(int n){
        if (n<2) return 0;

       int is_twin_prime =0;

       if (checkPrime(n)==1){
            if (checkPrime(n+2)==1) is_twin_prime =1;
            if (checkPrime(n-2)==1) is_twin_prime =1;
        }

       return is_twin_prime;
    }

   static int checkPrime(int n){
        int isPrime =1;

       for(int i=2; i<=n/2; i++){
            if (n%i ==0){
                isPrime =0;
                break;
            }
        }
        return isPrime;
    }
}