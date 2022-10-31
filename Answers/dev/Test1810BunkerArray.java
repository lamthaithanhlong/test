package saiPackage.dev;



public class Test1810BunkerArray {
    public static void main(String[] args){
        System.out.println("{4, 9, 6, 7, 3}   : " + isBunkerArray(new int[]{4, 9, 6, 7, 3}));
        System.out.println("{4, 9, 6, 15, 21} : " + isBunkerArray(new int[]{4, 9, 6, 15, 21}));
    }



   static int isBunkerArray(int[] a){
        int ret =0;
        int isNextPrime =0;



       for(int i=0; i<a.length-1; i++){
            if(a[i]%2 !=0)
                if(isPrime(a[i+1]) ==1) { ret =1; break; }
        }
        return ret;
    }



   static int isPrime(int n){
        if (n<2) return 0;



       int prime =1;



       for(int i=2; i<=n/2; i++)
            if (n%i ==0) prime =0;



       return prime;
    }

}
