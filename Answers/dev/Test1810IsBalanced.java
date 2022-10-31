package saiPackage.dev;

public class Test1810IsBalanced {
    public static void main(String[] args){
        System.out.println("{2, 3, 6, 7}     : " + isBalanced(new int[]{2, 3, 6, 7}));
        System.out.println("{6, 7, 2, 3, 12} : " + isBalanced(new int[]{6, 7, 2, 3, 12}));
        System.out.println("{7, 15, 2, 3}    : " + isBalanced(new int[]{7, 15, 2, 3}));
        System.out.println("{16, 6, 2, 3}    : " + isBalanced(new int[]{16, 6, 2, 3}));
    }

   static int isBalanced(int[] a){
        int ret =1;

       for (int i=0, j=1; i<a.length; i=i+2, j=j+2){

           if (a[i]%2 !=0 ) { ret =0; break; }

           if (j<a.length)
                if (a[j]%2 ==0) { ret =0; break; }
        }

       return ret;
    }
}
