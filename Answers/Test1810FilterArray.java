package saiPackage;

public class Test1810FilterArray {
    public static void main(String[] args){
        System.out.println("{1, 2, 3, 9, 6, 11}      : " + isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println("{3, 4, 6, 7, 14, 16}     : " + isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println("{1, 2, 3, 4, 10, 11, 13} : " + isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
        System.out.println("{3, 6, 5, 5, 13, 6, 13}  : " + isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println("{9, 6, 18}               : " + isFilter(new int[]{9, 6, 18}));
        System.out.println("{4, 7, 13}               : " + isFilter(new int[]{4, 7, 13}));
    }

   static int isFilter(int[] a){
        int has_09 =0;
        int has_11 =0;
        int idx_09 =0;
        int idx_11 =0;

       int has_07 =0;
        int has_13 =0;

       for (int i=0; i<a.length; i++){
            if(a[i] ==9 ) {has_09 =1; idx_09 =i;}
            if(a[i] ==11) {has_11 =1; idx_11 =i;}
            if(a[i] ==7 ) {has_07 =1;}
            if(a[i] ==13) {has_13 =1;}
        }

       if      (has_09==1 && has_11==0)                    return 0;
        else if (has_09==1 && has_11==0 && idx_09 > idx_11) return 0;
        else if (has_07==1 && has_13==1)                    return 0;
        else                                                return 1;
    }
}