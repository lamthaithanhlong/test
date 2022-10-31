package saiPackage;

public class Question25isSym{
  public static void main(String[] args){
    System.out.println("Is {2,7,9,10,11,5,8}  Symmetrical : " + isSym(new int[]{2,7,9,10,11,5,8}));
    System.out.println("Is {9,8,7,13,14,17}   Symmetrical : " + isSym(new int[]{9,8,7,13,14,17}));
    System.out.println("Is {2,7,8,9,11,13,10} Symmetrical : " + isSym(new int[]{2,7,8,9,11,13,10}));
  }
  static int isSym(int[] a){
    int isSymmetrical = 1;  
      int left =0;  
      int right=0;

    for (int i=0; i<a.length/2; i++){
      left  = a[i]%2;
      right = a[a.length-1-i]%2;

      if (left != right) isSymmetrical = 0;
    }

    return isSymmetrical;
  }
}


/*
package me.sekayasin;

public class Question25isSym {

    public static void main(String[] args) {
        System.out.println(isSym(new int[]{2,7,8,9,11,13,10}));
    }

    static int isSym(int[] a) {
        int isSymArray = 1;
        int[] firstHalfSym = new int[a.length/2];
        int[] secondHalfSym = new int[a.length/2];

        for (int i = 0; i < a.length/2; i++) {
            firstHalfSym[i] = a[i];
        }

        int count = a.length/2 - 1;
        if (a.length % 2 == 0) {
            for (int j = a.length - 1; j >= a.length/2; j--) {
                secondHalfSym[count] = a[j];
                count--;
            }
        } else {
            for (int j = a.length - 1; j >= a.length/2 + 1; j--) {
                secondHalfSym[count] = a[j];
                count--;
            }
        }

        // now compare arrays
        for (int i = 0, j=a.length/2 - 1; i < firstHalfSym.length; i++, j--) {
            if (firstHalfSym[i] % 2 == 0) {
                if (secondHalfSym[j] % 2 != 0) {
                    isSymArray = 0;
                    return isSymArray;
                }
            }
            if (firstHalfSym[i] % 2 == 1) {
                if (secondHalfSym[j] % 2 != 1) {
                    isSymArray = 0;
                    return isSymArray;
                }
            }
        }

        return isSymArray;
    }
}
*/
