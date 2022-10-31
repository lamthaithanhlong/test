package saiPackage;

public class Question48isOneBalanced{
    public static void main(String[] args){
        System.out.println("{1, 1, 1, 2, 3, -18, 45, 1} : " + isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println("{1,1,1,2,3,-18,45,1,0}      : " + isOneBalanced(new int[]{1,1,1,2,3,-18,45,1,0}));
        System.out.println("{1, 1, 2, 3, 1, -18, 26, 1} : " + isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println("{}                          : " + isOneBalanced(new int[]{}));
        System.out.println("{3, 4, 1, 1}                : " + isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println("{1, 1, 3, 4}                : " + isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println("{3, 3, 3, 3, 3, 3}          : " + isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println("{1, 1, 1, 1, 1, 1}          : " + isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
    }

    static int isOneBalanced(int[] a){
        int noOfBeginningOnes =0;
        int noOfEndingOnes    =0;
        int noOfNoneOnes      =0;

        if (a.length ==0) return 1;

        if (a[0] == 1){
            for (int i=0; i<a.length; i++){
                if (a[i]==1) noOfBeginningOnes++;
                else break;
            }
        } // end of if for Beginning Ones

        if (a[a.length-1] == 1){
            for (int i=a.length-1; i>=0; i--){
                if (a[i]==1) noOfEndingOnes++;
                else break;
            }
        } // end of if for Ending Ones

        for (int i=0; i<a.length; i++){
            if (a[i]!=1) noOfNoneOnes++;
        }

        if ( (noOfBeginningOnes + noOfEndingOnes) == noOfNoneOnes )
            return 1;
        else
            return 0;
    }

}

