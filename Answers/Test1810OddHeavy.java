package saiPackage;

public class Test1810OddHeavy {
    public static void main(String[] args){
        System.out.println("{11, 4, 9, 2, 8}     : " + isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println("{11, 4, 9, 2, 3, 10} : " + isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println("{1}                  : " + isOddHeavy(new int[]{1}));
        System.out.println("{2}                  : " + isOddHeavy(new int[]{2}));
        System.out.println("{1, 1, 1, 1, 1, 1}   : " + isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println("{2, 4, 6, 8, 11}     : " + isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println("{-2, -4, -6, -8, -11}: " + isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
   }

   static int isOddHeavy(int[] a){
        int odd  =0;
        int even =0;
        int ret  =1;

// odd is greater than every even-valued element
// smallest odd must be greater than biggest even.
       for(int i=0; i<a.length; i++){
            if(a[i]%2 ==0) // for EVEN
            {
               if (even ==0) even =a[i];
               if(a[i]>even) even =a[i];
            }
            else  // for ODD
            {
               if (odd ==0) odd =a[i];
               if(a[i]<odd) odd =a[i];
            }
        }

       if (odd ==0 || odd <even) ret =0;

       return ret;
    }
}