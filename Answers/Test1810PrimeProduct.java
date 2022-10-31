package saiPackage;



public class Test1810PrimeProduct {
    public static void main(String[] args){
        System.out.println("Is 22 prime product : " + isPrimeProduct(22));
        System.out.println("Is 33 prime product : " + isPrimeProduct(33));
        System.out.println("Is 44 prime product : " + isPrimeProduct(44));
        System.out.println("Is 55 prime product : " + isPrimeProduct(55));
        System.out.println("Is 66 prime product : " + isPrimeProduct(66));
        System.out.println("Is 77 prime product : " + isPrimeProduct(77));
    }



   static int isPrimeProduct(int n){
        int ret =1;



       for (int i=2; i<=n/2; i++){
            if(n%i ==0) {
                if (isPrime(i) ==0) ret =0;
            }
        }



       return ret;
    }



   static int isPrime(int n){
        int ret =1;



       for (int i=2; i<=n/2; i++)
            if (n%i ==0) { ret =0; break; }



       return ret;
    }
}
