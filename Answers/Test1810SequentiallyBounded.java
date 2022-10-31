package saiPackage;



public class Test1810SequentiallyBounded {
    public static void main(String[] args){
        System.out.println("{2, 3, 3, 99, 99, 99, 99, 99} : " + isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println("{1, 2, 3}                     : " + isSequentiallyBounded(new int[]{1, 2, 3}));
        System.out.println("{2, 3, 3, 3, 3}               : " + isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println("{12, 12, 9}                   : " + isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println("{0, 1}                        : " + isSequentiallyBounded(new int[]{0, 1}));
        System.out.println("{-1, 2}                       : " + isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println("{}                            : " + isSequentiallyBounded(new int[]{}));
        System.out.println("{5, 5, 5, 5}                  : " + isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println("{5, 5, 5, 2, 5}               : " + isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
    }

   static int isSequentiallyBounded(int[] a){
        if (a.length ==0) return 1;
        if (a[0]<2) return 0;

       if (isInAscendingOrder(a) ==0) return 0;

       int num   =0;
        int count =0;
        int ret   =1;

       for(int i=0; i<a.length; i++){
            if (num==a[i])
                count++;
            else {
                num = a[i];
                count=1;
            }

           if (count>=num) ret =0;
        }
       return ret;
    }

   static int isInAscendingOrder(int[] a){
        int ret =1;

       for(int i=0; i<a.length-1; i++)
            if (a[i] > a[i+1]) ret =0;
       
        return ret;
    }
}