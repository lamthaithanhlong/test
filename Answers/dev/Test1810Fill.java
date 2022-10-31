package saiPackage.dev;



public class Test1810Fill {
    public static void main(String[] args){
        int[] a;
        System.out.print("({1,2,3,5, 9, 12,2, 1}, 3, 10) : ");
        a = isFill((new int[]{1,2,3,5, 9, 12,2, 1}), 3, 10);   printFill(a);



       System.out.print("({4, 2, 3, 12}, 1, 5)          : ");
        a = isFill((new int[]{4, 2, 3, 12}), 1, 5);            printFill(a);



       System.out.print("({2, 6, 9, 0, 3}, 0, 4)        : ");
        a = isFill((new int[]{2, 6, 9, 0, 3}), 0, 4);          printFill(a);
    }



   static int[] isFill(int[] arr, int k, int n){
        if (k<1 || n<1) return null;



       int[] ret =new int[n];



       for(int i=0, j=0; i<ret.length; i++, j++){
            if (j>=k) j=0;
            ret[i] = arr[j];
        }
        return ret;
    }
    static void printFill(int[] a){
        if (a ==null)
            System.out.print("NULL\n");
        else{
            System.out.print(a[0]);
            for (int i=1; i<a.length; i++){
                System.out.print(", " + a[i]);
            }
            System.out.print("\n");
        }
    }



}
