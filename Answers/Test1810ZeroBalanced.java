// same problem is mentioned as isBalanced.

package saiPackage;

public class Question80ZeroBalanced{
    public static void main(String[] args){
        System.out.println("{1, 2, -2, -1}        : " + isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println("{-3, 1, 2, -2, -1, 3} : " + isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println("3, 4, -2, -3, -2}     : " + isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println("{0, 0, 0, 0, 0, 0}    : " + isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println("{3, -3, -3}           : " + isZeroBalanced(new int[]{3, -3, -3}));
        System.out.println("{3}                   : " + isZeroBalanced(new int[]{3}));
        System.out.println("{}                    : " + isZeroBalanced(new int[]{}));
   }

   static int isZeroBalanced(int[] a){
        if (a.length < 2) return 0;

        int found =0;
        int total =0;

        for (int i=0; i<a.length; i++){
            total +=a[i];
            found =0;

            for(int j=0; j<a.length; j++){
                if (a[i] == (-1*a[j])) found =1;
            }
            if (found==0) break;
        }

        if (total==0 && found ==1)
            return 1;
        else
            return 0;
    }
}
