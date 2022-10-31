package saiPackage;

public class Test1810Dual {
    public static void main(String[] args){
        System.out.println("{1, 2, 3, 0}       : " + isDual(new int[]{1, 2, 3, 0}));
        System.out.println("{1, 2, 2, 1, 3, 0} : " + isDual(new int[]{1, 2, 2, 1, 3, 0}));
        System.out.println("{1, 1, 2, 2}       : " + isDual(new int[]{1, 1, 2, 2}));
        System.out.println("{1, 2, 1}          : " + isDual(new int[]{1, 2, 1}));
        System.out.println("{}                 : " + isDual(new int[]{}));

    }

    static int isDual(int[] a){
        int ret      =1;
        int prev_sum =0;
        int curr_sum =0;

        if (a.length%2 !=0) return 0;
        if (a.length   ==0) return 1;

        int num      = a[0] + a[1];

        for(int i=2; i<a.length; i+=2){
            if(num !=a[i]+a[i+1]) ret =0; 
        }

        return ret;
    }
}



/*
Question 2. An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements sum to the same value. Write a function named isDual that accepts an array of integers and returns 1 if the array is dual, otherwise it returns 0. Examples: {1, 2, 3, 0} is a dual array (because 1+2 = 3+0 = 3), {1, 2, 2, 1, 3, 0} is a dual array (because 1+2 = 2+1 = 3+0 = 3), {1, 1,
   2, 2}</td> is not a dual array (because 1+1 is not equal to 2+2), {1, 2, 1}</td> array (because array does not have an even number of elements), {} is a dual array. If you are programming in Java or C#, the function signature is
int isDual(int[ ] a)
*/

