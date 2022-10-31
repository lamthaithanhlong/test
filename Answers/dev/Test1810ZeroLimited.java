package saiPackage.dev;

public class Test1810ZeroLimited {
    public static void main(String[] args){
        System.out.println("{0, 0, 0, 0, 0}                   : " + isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println("{1, 0}                            : " + isZeroLimited(new int[]{1, 0}));
        System.out.println("{0, 1}                            : " + isZeroLimited(new int[]{0, 1}));
        System.out.println("{5}                               : " + isZeroLimited(new int[]{5}));
        System.out.println("{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0} : " + isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println("{}                                : " + isZeroLimited(new int[]{}));
    }

   static int isZeroLimited(int[] a){
        int n   =0;
        int idx =0;
        int ret =1;

       for(int i=0; i<a.length; i++){
            idx = (3*n)+1;

           if      (idx ==i && a[i]!=0) {ret =0; break;}
            else if (idx ==i && a[i]==0) {n++;}
            else if (idx !=i && a[i]==0) {ret =0; break;}
        }

       return ret;
    }
}