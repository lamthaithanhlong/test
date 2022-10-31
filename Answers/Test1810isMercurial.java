package saiPackage;

public class Question51isMercurial{
    public static void main(String[] args){
        System.out.println("{1, 2, 10, 3, 15, 1, 2, 2}     : " + isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println("{5, 2, 10, 3, 15, 1, 2, 2}     : " + isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println("{1, 2, 10, 3, 15, 16, 2, 2}    : " + isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println("{3, 2, 18, 1, 0, 3, -11, 1, 3} : " + isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println("{2, 3, 1, 1, 18}               : " + isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println("{8, 2, 1, 1, 18, 3, 5}         : " + isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println("{3, 3, 3, 3, 3, 3}             : " + isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println("{1}                            : " + isMercurial(new int[]{1}));
        System.out.println("{}                             : " + isMercurial(new int[]{}));
    }

    static int isMercurial(int[] a){
        int ret =1;
        int idx_first_one  =0;
        int idx_second_one =0;
        int idx_three      =0;

        for(int i=0; i<a.length; i++){
            if ((a[i] ==1 && idx_three ==0) || (a[i] ==1 && idx_first_one ==0)) 
                idx_first_one = i+1; 

            if (a[i] ==3) 
                idx_three = i+1; 

            if (a[i] ==1 && idx_three !=0) 
                idx_second_one = i+1; 

            if (idx_first_one !=0 && idx_second_one !=0 && idx_three !=0){
                if (idx_first_one < idx_three && idx_three < idx_second_one) ret =0;
            }
        }

        return ret;

    }

}

