package saiPackage.dev;

public class Test1810sumEvenOdd {
  public static void main(String args[]){
    System.out.println("{1}       : " + sumEvenOdd(new int[]{1}));
    System.out.println("{1,2}     : " + sumEvenOdd(new int[]{1,2}));
    System.out.println("{1,2,3}   : " + sumEvenOdd(new int[]{1,2,3}));
    System.out.println("{1,2,3,4} : " + sumEvenOdd(new int[]{1,2,3,4}));
    System.out.println("{3,3,4,4} : " + sumEvenOdd(new int[]{3,3,4,4}));
    System.out.println("{}        : " + sumEvenOdd(new int[]{}));
  }

  static int sumEvenOdd(int[] a){
    int X=0;  // sum of the odd numbers
    int Y=0;  // sum of the even numbers

//    if (a.length == 0) return 0; 

    for (int i=0; i<a.length; i++){
      if (a[i] % 2 == 0) 
        Y += a[i];
      else
        X += a[i];
    }
    return X-Y; 
  }
}

/*
package me.sekayasin;

public class Question2sumEvenOdd {

    public static void main(String[] args) {
        System.out.println(sumEvenOdd(new int[]{1,2,3,4}));
    }

    static int sumEvenOdd(int[] items) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0)
                sumEven += items[i];
            else
                sumOdd += items[i];
        }
        return sumOdd - sumEven;
    }
}
*/
