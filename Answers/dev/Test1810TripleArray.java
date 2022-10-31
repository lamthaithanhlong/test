/*
 Define a Triple array to be an array where every value occurs exactly three times. For example, {3, 1, 2, 1, 3, 1, 3, 2, 2} is a Triple array.
The following arrays are not Triple arrays
{2, 5, 2, 5, 5, 2, 5} (5 occurs four times instead of three times) {3, 1, 1, 1} (3 occurs once instead of three times)
Write a function named isTriple that returns 1 if its array argument is a Triple array. Otherwise it returns 0. If you are programming in Java or C#, the function signature is
int isTriple (int[ ] a)

in some question paper, the tweak the problem as Dual Array => isDual
*/
package saiPackage.dev;

public class Test1810TripleArray {
    public static void main(String[] args){
        System.out.println("{3, 1, 2, 1, 3, 1, 3, 2, 2} : " + isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println("{2, 5, 2, 5, 5, 2, 5}       : " + isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
        System.out.println("{3, 1, 1, 1}                : " + isTriple(new int[]{3, 1, 1, 1}));
    }

    static int isTriple(int[] a){
        int count =0;
        int ret   =1;

        for (int i=0; i<a.length; i++){
            count =1; 

            for (int j=0; j<a.length; j++){
                if(i!=j)
                    if(a[i] ==a[j]) count++;
            }
            if (count!=3) {ret =0; break;}
        }
        return ret;
    }
}

