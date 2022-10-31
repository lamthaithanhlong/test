/*
A Nice array is defined to be an array where for every value n in the array, there is also an
element n1
or n+1 in the array.
For example, {2, 10, 9, 3} is a Nice array because
2 = 31
10 = 9+1
3 = 2 + 1
9 = 10 1
Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, 1, 1}.
The array {3, 4, 5, 7} is not a Nice array because of the value 7 which requires that the array contains
either the value 6 (71)
or 8 (7+1) but neither of these values are in the array.
Write a function named isNice that returns 1 if its array argument is a Nice array. Otherwise it returns
a 0.
If you are programming in Java or C#, the function signature is
int isNice(int[ ] a)

In some question, it is called as Bean Array ==> isBean
*/



package saiPackage.dev;



public class Test1810NiceArray {
    public static void main(String[] args){
        System.out.println("{2, 10, 9, 3}      : " + isNice(new int[]{2, 10, 9, 3}));
        System.out.println("{2, 2, 3, 3, 3}    : " + isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println("{1, 1, 1, 2, 1, 1} : " + isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println("{0, -1, 1}         : " + isNice(new int[]{0, -1, 1}));
        System.out.println("{3, 4, 5, 7}       : " + isNice(new int[]{3, 4, 5, 7}));
    }



   static int isNice(int[] a){
        int ret =1;
        boolean found;



       for (int i=0; i<a.length; i++){
            found =false;
            for (int j=0; j<a.length; j++){
                if(a[j]+1 ==a[i] || a[j]-1 ==a[i]) { found =true; break; }
            }
            if (!found) { ret =0; break; }
        }
        return ret;
    }
}
