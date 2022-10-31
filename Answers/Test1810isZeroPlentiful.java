package saiPackage;

public class Question35isZeroPlentiful{
    public static void main(String[] args){
        System.out.println("{0, 0, 0, 0, 0} : " + isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println("{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12} : " + isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println("{0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0} : " + isZeroPlentiful(new int[]{0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}));
        System.out.println("{1, 2, 3, 4} : " + isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println("{1, 0, 0, 0, 2, 0, 0, 0, 0} : " + isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println("{0} : " + isZeroPlentiful(new int[]{0}));
        System.out.println("{} : " + isZeroPlentiful(new int[]{}));
    }

    static int isZeroPlentiful(int[] a){
        int isZero =0;
        int ret    =0;

        for (int i=0; i<a.length; i++){
            if (a[i] == 0) 
                isZero++;
            else{
                if (isZero >=4)
                    ret++;

                isZero =0;
            }
        }
        if (isZero >=4)
            ret++;
        return ret;
    }

}
