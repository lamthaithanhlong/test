package saiPackage;


public class Test1810primeCount {
  public static void main(String[] args){
/*    System.out.println("Prime count between 10 and 30 is : " + primeCount(10,30));
    System.out.println("Prime count between 11 and 29 is : " + primeCount(11,29));
    System.out.println("Prime count between 20 and 22 is : " + primeCount(20,22));
    System.out.println("Prime count between 1  and 1  is : " + primeCount(1,1));
    System.out.println("Prime count between 5  and 5  is : " + primeCount(5,5));
    System.out.println("Prime count between 6  and 2  is : " + primeCount(6,2));*/
    System.out.println("Prime count between -10  and 6  is : " + primeCount(-10,6));
  }
  static int primeCount(int start, int end){
    int num = start;
    boolean isPrime = true;
    int primeCount = 0;

    if (start==1 || end<start) return 0;
    if (start<2) num=2;

    System.out.println("num here is : " + num);
    for(int i=num; i<=end; i++){
      num = i;
          System.out.println("num2 here is : " + num);
      isPrime = true; 
      for(int j=2; j<=num/2; j++){
        if(num % j ==0) {
          isPrime = false;
        }
      }// end of inner for loop
      if (isPrime) {
        primeCount++;
        System.out.println(num + " is prime");
      }
      else
      {
        System.out.println(num + " is not prime");
      }
    } // end of outer for loop
    return primeCount;
  }

}







































/*
package me.sekayasin;

public class Question9primeCount {

    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
    }

    static int primeCount(int start, int end) {
        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j*2 <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    primeCount++;
            }
        }
        return primeCount;
    }
}
*/
