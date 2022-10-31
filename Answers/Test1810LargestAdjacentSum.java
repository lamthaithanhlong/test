package saiPackage;

public class Question79LargestAdjacentSum{
    public static void main(String[] args){
        System.out.println("{1, 2, 3, 4}        : " + largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println("{18, -12, 9, -10}   : " + largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println("{1,1,1,1,1,1,1,1,1} : " + largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println("{1,1,1,1,1,2,1,1,1} : " + largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }

   static int largestAdjacentSum(int[] a){
        int largestNum =0;

       if(a.length < 2) return 0;

       for (int i=0; i<a.length-1; i++){
            if (largestNum < a[i]+a[i+1]){
                largestNum = a[i]+a[i+1];
            }
        }
        return largestNum;
    }
}