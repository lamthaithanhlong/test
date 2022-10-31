package saiPackage;

public class Question43largestDifferenceOfEvens{
    public static void main(String[] args){
        System.out.println("{1, 3, 5, 9}                : " + largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println("{1, 18, 5, 7, 33}           : " + largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println("{2, 2, 2, 2}                : " + largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println("{1, 2, 1, 2, 1, 4, 1, 6, 4} : " + largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));

    }

    static int largestDifferenceOfEvens(int[] a){
        int ret       =0; 
        int smallEven =2;
        int bigEven   =0;
        int evenCount = 0;

        for (int i=0; i<a.length; i++){
            if (a[i]%2 ==0){
                if (a[i] < smallEven) smallEven =a[i];
                if (a[i] > bigEven  ) bigEven   =a[i];
                evenCount++;
            }        
        }

        if (evenCount ==0)     
            ret =1;
        else if (evenCount <2) 
            ret =-1;
        else {
            ret = bigEven - smallEven; 
        }

        return ret;
    }
}
