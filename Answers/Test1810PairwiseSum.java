package saiPackage;

public class Question58PairwiseSum{
    public static void main(String[] args){

        int[] a= pairwiseSum(new int[]{2, 1, 18, -5});
        System.out.print("{2, 1, 18, -5} : " );
        printArray(a);

        a= pairwiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1});
        System.out.print("{2, 1, 18, -5, -5, -15, 0, 0, 1, -1} : ");
        printArray(a);

        a= pairwiseSum(new int[]{2, 1, 18} );
        System.out.print("{2, 1, 18} : ");
        printArray(a);

        a= pairwiseSum(new int[]{});
        System.out.print("{} : ");
        printArray(a);

    }

    static int[] pairwiseSum(int[] a){
        if (a.length%2 !=0 || a.length ==0) return null;

        int[] b     = new int[a.length/2];
        int   idx_b = 0;

        for (int i=0; i<b.length; i++) b[i] =0;

        for (int i=0; i<a.length; i++){
            b[idx_b] += a[i];

            if ((i+1)%2 ==0)
                idx_b++;
        }

        return b;
    }

    static void printArray(int[] a){
        if (a == null)
            System.out.print("NULL\n");
        else{
            for (int i=0; i<a.length; i++){
                System.out.print(a[i] + ",");
            }
            System.out.print("\n");
        }

    }

}
