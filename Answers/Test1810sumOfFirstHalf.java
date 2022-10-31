package saiPackage;

public class Question15sumOfFirstHalf{
  public static void main(String[] args){
    System.out.println("The result is {5,4,3,2,3,4,6,1} : " + answerThree(new int[]{5,4,3,2,3,4,6,1}));
    System.out.println("The result is {5,4,3,2,3,3,4,6,1} : " + answerThree(new int[]{5,4,3,2,3,3,4,6,1}));
    System.out.println("The result is {5,4,3,2,3,4,6,3} : " + answerThree(new int[]{5,4,3,2,3,4,6,3}));
  }
  static int answerThree(int[] a){
    if ( a.length%2 != 0 ) return 0; // can't divide into half

    int firstHalf=0;
    int secondHalf=0;

    for (int i=0; i<a.length; i++){
      if (i < a.length/2){
        firstHalf += a[i];
      }else{
        secondHalf += a[i];
      }
    }

    if (firstHalf == secondHalf)
      return 1;
    else 
      return 0;
  }
}




/*
package me.sekayasin;

public class Question15 {

    public static void main(String[] args) {
        System.out.println(satisfiesConditions(new int[]{5,4,3,2,3,4,6,1}));
    }

    static int satisfiesConditions(int[] a) {
        int isSatisfied = 0;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        if (a.length % 2 == 0) {
            for (int i = 0; i < a.length/2; i++) {
                sumFirstHalf += a[i];
            }
            for (int i = a.length - 1; i >= a.length/2; i--) {
                sumSecondHalf += a[i];
            }
            if (sumFirstHalf == sumSecondHalf) {
                isSatisfied = 1;
                return isSatisfied;
            }
        }
        return isSatisfied;
    }
}
*/
