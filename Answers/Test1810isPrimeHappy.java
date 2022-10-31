package saiPackage;

public class Question39isPrimeHappy{
    public static void main(String[] args){
        System.out.println("Is  5 a Prime Happy : " + isPrimeHappy(5));
        System.out.println("Is 25 a Prime Happy : " + isPrimeHappy(25));
        System.out.println("Is 32 a Prime Happy : " + isPrimeHappy(32));
        System.out.println("Is  8 a Prime Happy : " + isPrimeHappy(8));
        System.out.println("Is  2 a Prime Happy : " + isPrimeHappy(2));

    }

    static int isPrimeHappy(int n){
        int happyPrime =1;
        int sumResult  =0;
        int ret        =0;

        if (n<3) return 0;

//        System.out.print("Prime : ");
        for (int i=2; i<n; i++){
            if (checkPrime(i)==1){
                sumResult +=i;
 //               System.out.print(i + ", ");
            }
            
        }
        if (sumResult%n ==0) ret =1;

//        System.out.print("\n Sum Result = " + sumResult  + "\n");
        return ret;
    }

    static int checkPrime(int n){

        int isPrime=1;

        for (int i=2; i<=n/2; i++)
            if (n%i==0) isPrime=0;

        return isPrime;
    }


}
