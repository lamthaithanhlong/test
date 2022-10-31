/*
3. An array is defined to be complete if all its elements are greater than 0 and all even numbers that are less than the maximum even number are in the array.
For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because
  
a. all its elements are greater than 0
b. the maximum even integer is 10
c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.

But {2, 3, 3, 6} is not complete because the even number 4 is missing. {2, -3, 4, 3, 6} is not complete because it contains a negative number.
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.
The function signature is int isComplete (int[ ] a)
*/

package saiPackage;

public class Test1810IsComplete3 {
    public static void main(String[] args){
        System.out.println(" {2, 3, 2, 4, 11, 6, 10, 9, 8} : " + isComplete(new int[] {2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(" {2, 3, 3, 6}                  : " + isComplete(new int[] {2, 3, 3, 6}));
        System.out.println(" {2, -3, 4, 3, 6}              : " + isComplete(new int[] {2, -3, 4, 3, 6}));
    }

    static int isComplete(int[] a){
        int ret      =1;
        int maxEven  =2;
        int nextEven =2;

        boolean found =false;

        for(int i=0; i<a.length; i++){
            if (a[i] <0) {ret =0; break;}

            if (a[i]%2 ==0)
                if(a[i] >maxEven) maxEven =a[i];
        }

        if (ret ==1){
            while(nextEven <maxEven){
                found =false; 
                for(int i=0; i<a.length; i++){
                    if(a[i] ==nextEven) found =true;
                }
                nextEven +=2;
                if (!found) {ret =0; break;}
            }
        }

        return ret;
    }

}

