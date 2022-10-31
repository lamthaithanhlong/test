package saiPackage;

public class Test1810nextPerfectSquare {
  public static void main(String[] args){
    System.out.println("nextPerfectSquare of 06 is : " + nextPerfectSquare(6)); 
    System.out.println("nextPerfectSquare of 36 is : " + nextPerfectSquare(36)); 
    System.out.println("nextPerfectSquare of 00 is : " + nextPerfectSquare(0)); 
    System.out.println("nextPerfectSquare of -5 is : " + nextPerfectSquare(-5)); 
  }
  
  static int nextPerfectSquare(int num){
    if (num < 0) return 0;
    
    int perfectNumber = 1;
    int perfectSquare = 1;

    while (perfectSquare <= num){
      perfectNumber++;
      perfectSquare = perfectNumber * perfectNumber;
    } 
    return perfectSquare;
  }

} 
 








































/*
package me.sekayasin;

public class Question7nextPerfectSquare {

    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(8));
    }

    static int nextPerfectSquare(int number) {
        int nextPerfectSquare = 0;

        if (number >= 0) {
            double sqrtResult = Math.sqrt(number);
            int baseNumber = (int) sqrtResult;
            int nextNumber = baseNumber + 1;
            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
        }

        return nextPerfectSquare;
    }
}
*/
