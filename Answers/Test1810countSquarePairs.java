package saiPackage;

public class Question18countSquarePairs{
  public static void main(String[] args){
    System.out.println("Square Pairs in {9,0,2,-5,7} : " + countSquarePairs(new int[]{9,0,2,-5,7}));
    System.out.println("Square Pairs in {9} : " + countSquarePairs(new int[]{9}));
  }

  static int isPerfectSquare(int num){
    int perfectNumber=1;
    int perfectSquare=1;

    for (int i=0; i<num/2; i++){
      perfectSquare = perfectNumber * perfectNumber; 

      if (perfectSquare == num) return 1;
      perfectNumber++;
    }
    return 0;
  }

  static int countSquarePairs(int[] a){
    // must be greater than 0
    // x < y
    // x+y = perfect square
    int x=0; int y=0; int count=0;
  
    for (int i=0; i<a.length; i++){
      x = a[i];
      for (int j=0; j<a.length; j++){
        y = a[j];
        if ( i!=j && x<y && x>0 && y>0){
          //int isPerfect = isPerfectSquare(x+y);
          if ((isPerfectSquare(x+y)) == 1) {
            count++;
            System.out.println("<"+x+","+y+"> pair is Perfect Square. Count=" + count);
          }
        }
      }
    }
    return count;
  }
}



/*
package me.sekayasin;

public class Question18countSquarePairs {

    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9,0,2,-5,7}));
    }

    static int countSquarePairs(int[] a) {
        int countSquarePairs = 0;
        for (int i = 1; i < a.length; i++){
            for (int j = 0; j < i; j++) {
                if (a[i] <= 0) break;
                if (a[j] <= 0) continue;
                if (isPerfectSquare(a[i] + a[j]) == 1)
                    countSquarePairs++;
            }
        }
        return countSquarePairs;
    }

    static int isPerfectSquare(int number) {
        int isPerfectSquare = 0;
        for (int i = 0; i < number/2; i++) {
            if (i * i == number) {
                isPerfectSquare = 1;
                break;
            }
        }
        return isPerfectSquare;
    }
}
*/
