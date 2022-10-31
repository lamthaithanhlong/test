package saiPackage;

public class Question44isHodder{
    public static void main(String[] args){
        System.out.println("Is   3 Hodder : " + isHodder(3));
        System.out.println("Is   7 Hodder : " + isHodder(7));
        System.out.println("Is  31 Hodder : " + isHodder(31));
        System.out.println("Is  32 Hodder : " + isHodder(32));
        System.out.println("Is  33 Hodder : " + isHodder(33));
        System.out.println("Is 127 Hodder : " + isHodder(127));
        System.out.println("Is 128 Hodder : " + isHodder(128));
        printHodder(7);  // This is just for test
    }
    
    static int isHodder(int n){
        boolean loop =true;
        int num      =1;
        int hodder   =0;

        if (isPrime(n) ==0) return 0;

        while (loop){
            num *= 2;

            if (num-1 == n){
                hodder = 1;
                loop   = false;
            }
            if (num-1 > n){
                loop   = false;
            }
        }
        return hodder;
    }

    static int isPrime(int n){
        int prime =1;

        for (int i=2; i<=n/2; i++)
            if (n%i ==0) prime=0;

        return prime;
    }

    // This is just for Testing.
    static void printHodder(int n){
        int num      =2;
        int count    =0;
        boolean loop =true;
     

        while (loop){
            num *= 2;
            if (isPrime(num-1) ==1){
                System.out.println ("Hooder Number " + (count+1) + " is : " + (num-1));
                count++;
            }

            if (count == n) loop = false;
        }
    }
}
