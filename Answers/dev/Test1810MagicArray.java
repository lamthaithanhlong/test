package saiPackage.dev;



public class Test1810MagicArray {
    public static void main(String[] args){
        System.out.println("{21, 3, 7, 9, 11 4, 6} : " + isMagicArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println("{13, 4, 4, 4, 4}       : " + isMagicArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println("{10, 5, 5}             : " + isMagicArray(new int[]{10, 5, 5}));
        System.out.println("{0, 6, 8, 20}          : " + isMagicArray(new int[]{0, 6, 8, 20}));
        System.out.println("{3}                    : " + isMagicArray(new int[]{3}));
        System.out.println("{8, 5, 5, 5, 3}        : " + isMagicArray(new int[]{8, 5, 5, 5, 3}));
        System.out.println("{0, 2, 4, 6}           : " + isMagicArray(new int[]{0, 2, 4, 6}));
        System.out.println("{0, 8, 4, 6}           : " + isMagicArray(new int[]{0, 8, 4, 6}));
    }



   static int isMagicArray(int[] a){
        int ret      =0;
        int primeSum =0;



       int isFirstElementZero =0;



       for(int i=0; i<a.length; i++){
            if(isPrime(a[i]) ==1){
                primeSum +=a[i];
            }
        }
        if (primeSum ==0 && a[0] ==0) ret =1;
        if (primeSum ==a[0])          ret =1;



       return ret;
    }



   static int isPrime(int n){
        int ret =1;



       if (n<2) ret =0;



       for(int i=2; i<=n/2; i++){
            if(n%i ==0) ret =0;
        }
        return ret;
    }



}
