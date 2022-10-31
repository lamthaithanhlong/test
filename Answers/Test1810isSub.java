package saiPackage;

public class Question24isSub{
    public static void main(String[] args){
        System.out.println("Is {13,6,3,2} Sub Array : " + isSub(new int[]{13,6,3,2}));
        System.out.println("Is {11,5,3,2} Sub Array : " + isSub(new int[]{11,5,3,2}));
    }  
    static int isSub(int[] a){
        int isSub  =1;
        int first  =0;
        int second =0;

        for(int i=0; i<a.length-1; i++){
            first  = a[i];
            second = 0; 
            for(int j=i+1; j<a.length; j++){
               second += a[j];
               System.out.println ("i=" + i + ", j=" + j);
               /* if (j == a.length)
                    second += a[j];
                else*/
            }
            if (first <= second) isSub=0;
        } // end of first for
        return isSub;
    }

}

/*
package me.sekayasin;

public class Question24isSub {

    public static void main(String[] args) {
        System.out.println(isSub(new int[]{13,6,3,2}));
    }

    static int isSub(int[] a) {
        int isSubArray = 0;
        int sumAfterElements = 0;

        for (int i = 0; i < a.length; i++) {
            isSubArray = 1;
            for (int j = i+1; j < a.length; j++) {
                sumAfterElements += a[j];
            }

            if (a[i] <= sumAfterElements) {
                isSubArray = 0;
                return isSubArray;
            }
            sumAfterElements = 0;
        }

        return isSubArray;
    }
}
*/
