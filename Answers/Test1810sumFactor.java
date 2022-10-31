package saiPackage;

public class Question22sumFactor{
    public static void main(String[] args){
        System.out.println("Sum Factor of {3,0,2,-5,0}    is : " + sumFactor(new int[]{3,0,2,-5,0}));
        System.out.println("Sum Factor of {9,-3,-3,-1,-1} is : " + sumFactor(new int[]{9,-3,-3,-1,-1}));
        System.out.println("Sum Factor of {1}             is : " + sumFactor(new int[]{1}));
        System.out.println("Sum Factor of {0,0,0}         is : " + sumFactor(new int[]{0,0,0}));
    }
    static int sumFactor(int[] a){
        int sum_factor =0;
        int total      =0;
        int frequency  =0;

        if (a.length ==0) return 0;

        for(int i=0; i<a.length; i++)
            total+=a[i];

        for(int i=0; i<a.length; i++)
            if (total==a[i]) frequency++;

        return frequency;
    }
}




/*
package me.sekayasin;

public class Question22sumFactor {

    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{3,0,2,-5,0}));
    }

    static int sumFactor(int[] a) {
        int sumOfTheArray = 0;
        int sumFactor = 0;

        if (a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            sumOfTheArray += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sumOfTheArray) sumFactor++;
        }

        return sumFactor;
    }
}
*/
