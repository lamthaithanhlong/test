package saiPackage.dev;

public class Test1810Centered15 {
    public static void main(String[] args){
        System.out.println("{3, 2, 10, 4, 1, 6, 9} : " + isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println("{2, 10, 4, 1, 6, 9}    : " + isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println("{3, 2, 10, 4, 1, 6}    : " + isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println("{1,1,8, 3, 1, 1}       : " + isCentered15(new int[]{1,1,8, 3, 1, 1}));
        System.out.println("{9, 15, 6}             : " + isCentered15(new int[]{9, 15, 6}));
        System.out.println("{1, 1, 2, 2, 1, 1}     : " + isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println("{1, 1, 15 -1,-1}       : " + isCentered15(new int[]{1, 1, 15 -1,-1}));
    }

    static int isCentered15(int[] a){
        int forwardIdx =0;
        int backwardIdx=a.length-1;
        int ret =0;

        while (forwardIdx <=backwardIdx){
            int total =0;
            for(int i=forwardIdx; i<=backwardIdx; i++){
                total += a[i];
            }
            forwardIdx++; backwardIdx--;

            if (total == 15){
                ret =1;
                break;
            }
        }

        return ret;
    }

}


