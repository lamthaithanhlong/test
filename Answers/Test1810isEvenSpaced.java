package saiPackage;

public class Question23isEvenSpaced{
  public static void main(String[] args){
      System.out.println("Is {100,19,131,140} Even Spaced : " + isEvenSpaced(new int[]{100,19,131,140}));
      System.out.println("Is {200,1,151,160} Even Spaced : " + isEvenSpaced(new int[]{200,1,151,160}));
      System.out.println("Is {200,10,151,160} Even Spaced : " + isEvenSpaced(new int[]{200,10,151,160}));
      System.out.println("Is {100,19,-131,-140} Even Spaced : " + isEvenSpaced(new int[]{100,19,-131,-140}));
      System.out.println("Is {80,-56,11,-81} Even Spaced : " + isEvenSpaced(new int[]{80,-56,11,-81}));

  }
  static int isEvenSpaced(int[] a){
      int evenSpaced =1;
      int largest    =a[0];
      int smallest   =a[0];

      if (a.length < 2) return 0;

      for (int i=1; i<a.length; i++){
          if (a[i] > largest ) largest  =a[i];
          if (a[i] < smallest) smallest =a[i];
      }

      if ((largest-smallest)%2 != 0)
          evenSpaced = 0;
    
      return evenSpaced; 
  }
}




/*
package me.sekayasin;

public class Question23isEvenSpaced {

    public static void main(String[] args) {
        System.out.println(isEvenSpaced(new int[]{80,-56,11,-81}));
    }

    static int isEvenSpaced(int[] a) {
        int isEvenSpaced = 0;
        if (a.length < 2) return 0;

        int largestValue = a[0];
        int smallestValue = a[0];

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    if (a[i] > largestValue) largestValue = a[i];
                }
                if (a[i] < a[j]) {
                    if (a[i] < smallestValue) smallestValue = a[i];
                }
            }
        }
        if ((largestValue - smallestValue) % 2 == 0) isEvenSpaced = 1;
        return isEvenSpaced;
    }
}
*/
