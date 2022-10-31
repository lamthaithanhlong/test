package saiPackage.dev;

public class Test1810DaphneArray {
    public static void main(String[] args){
        System.out.println(" {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} : " + isDaphne(new int[] {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}));
        System.out.println(" {2, 4, 6, 8, 6}      : " + isDaphne(new int[] {2, 4, 6, 8, 6}));
        System.out.println(" {2, 8, 7, 10, -4, 6} : " + isDaphne(new int[] {2, 8, 7, 10, -4, 6}));

    }

    static int isDaphne(int[] a){
        int ret                 =1;
        int even_count_at_start =0;
        int even_count_at_end   =0;

        boolean hasOdd =false;

        for(int i=0; i<a.length; i++){
            if(a[i]%2 ==1) { hasOdd =true; break;}
            else           even_count_at_start++;
        }

        if (!hasOdd) ret =0;

        for(int i=a.length-1; i>=0; i--){
            if(a[i]%2 ==1) { break; }
            else           even_count_at_end++;
        }

        if (even_count_at_start==0 || even_count_at_end==0 || (even_count_at_start !=even_count_at_end)) ret =0;

        return ret;
    }
}

/*
2. A Daphne array is defined to be an array that contains at least one odd number and begins and ends with the same number of even numbers.
So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it begins with three even numbers and ends with three even numbers and it contains at least one odd number
The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain an odd number.
The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with two even numbers but ends with three even numbers.
Write a function named isDaphne that returns 1 if its array argument is a Daphne array. Otherwise, it returns 0.
If you are writing in Java or C#, the function signature is int isDaphne (int[ ] a)

*/
