package saiPackage;

public class Question69Hollow{
    public static void main(String[] args){
        System.out.println("{1,2,0,0,0,3,4}              : " + isHollow(new int[]{1,2,0,0,0,3,4}));
        System.out.println("{1,1,1,1,0,0,0,0,0,2,1,2,18} : " + isHollow(new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18}));
        System.out.println("{1, 2, 0, 0, 3, 4}           : " + isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println("{1,2,0,0,0,3,4,5}            : " + isHollow(new int[]{1,2,0,0,0,3,4,5}));
        System.out.println("{3,8,3,0,0,0,3,3}            : " + isHollow(new int[]{3,8,3,0,0,0,3,3}));
        System.out.println("{1,2,0,0,0,3,4,0}            : " + isHollow(new int[]{1,2,0,0,0,3,4,0}));
        System.out.println("{0,1,2,0,0,0,3,4}            : " + isHollow(new int[]{0,1,2,0,0,0,3,4}));
        System.out.println("{0,0,0}                      : " + isHollow(new int[]{0,0,0}));
    }

    static int isHollow(int[] a){
        int count_zero           =0; 
        int count_non_zero_start =0;
        int count_non_zero_end   =0;
        int count_non_zero_mid   =0;

        int zero_idx_start =0;
        int zero_idx_end   =0;

        int ret =1;

        if (a[0]==0 && a[a.length-1]!=0) return 0;
        if (a[0]!=0 && a[a.length-1]==0) return 0;

        for(int i=0; i<a.length/2; i++){
            if (a[i] != 0) count_non_zero_start++; 
            if (a[i] == 0) {zero_idx_start = i; break;}
        }

        for(int i=a.length-1; i>a.length/2; i--){
            if (a[i] != 0) count_non_zero_end++; 
            if (a[i] == 0) {zero_idx_end = i; break;}
        }

        for(int i=zero_idx_start; i<=zero_idx_end; i++){
            if (a[i] != 0) count_non_zero_mid++; 
            if (a[i] == 0) count_zero++; 
        }

        if (count_non_zero_mid > 0)                     ret =0;
        if (count_zero < 3)                             ret =0;
        if (count_non_zero_start != count_non_zero_end) ret =0;

        return ret;
    } 

}


