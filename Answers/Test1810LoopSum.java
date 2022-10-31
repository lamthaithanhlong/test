package saiPackage;

public class Question61LoopSum{
    public static void main(String[] args){
        System.out.println("{1, 2, 3},2    : " + loopSum(new int[]{1, 2, 3},2));
        System.out.println("{-1, 2, -1},7  : " + loopSum(new int[]{-1, 2, -1},7));
        System.out.println("{1, 4, 5, 6},4 : " + loopSum(new int[]{1, 4, 5, 6},4));
        System.out.println("{3},10         : " + loopSum(new int[]{3},10));
    }

    static int loopSum(int[] a, int n){
        if (n<1) return 0;

        int idx    =0;
        int result =0;
    

        for (int i=0; i<n; i++){
            result += a[idx++];

            if (idx==a.length) idx =0;
        }

        return result;
    }

}

