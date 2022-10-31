package saiPackage;

public class Test1810FineArray {
    public static void main(String[] args){
        System.out.println("{4, 7, 9, 6, 5} : " + isFineArray(new int[]{4, 7, 9, 6, 5}));
        System.out.println("{4, 9, 6, 33}   : " + isFineArray(new int[]{4, 9, 6, 33}));
        System.out.println("{3, 8, 15}      : " + isFineArray(new int[]{3, 8, 15}));
    }

   static int isFineArray(int[] a){
        int hasPrime =0;
        int hasTwinPrime =0;

       for(int i=0; i<a.length; i++){
            if(isPrime(a[i]) ==1){
                hasPrime =1;

               for(int j=0; j<a.length; j++){
                    if(i!=j){
                        if(isPrime(a[j]) ==1 && Math.abs(a[j]-a[i]) ==2 ){
                            hasTwinPrime =1;
                        }
                    }
                }
            }
        }
        if      (hasPrime ==0)                     return 1;
        else if (hasPrime ==1 && hasTwinPrime ==1) return 1;
        else                                       return 0;
    }

   private static int isPrime(int n){
        int is_prime =1;

       if (n<2) return 0;

       for(int i=2; i<=n/2; i++)
            if (n%i ==0) is_prime =0;

       return is_prime;
   }
}