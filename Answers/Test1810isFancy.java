package saiPackage;

public class Question10isFancy{
  public static void main(String[] args){
    System.out.println("Is 1 a Fancy number (1:fancy, 0:notFancy) # " + isFancy(1));
    System.out.println("Is 5 a Fancy number (1:fancy, 0:notFancy) # " + isFancy(5));
    System.out.println("Is 16 a Fancy number (1:fancy, 0:notFancy) # " + isFancy(16));
    System.out.println("Is 17 a Fancy number (1:fancy, 0:notFancy) # " + isFancy(17));
    System.out.println("Is 61 a Fancy number (1:fancy, 0:notFancy) # " + isFancy(61));
    System.out.println("Is 217 a Fancy number (1:fancy, 0:notFancy) # " + isFancy(217));
    System.out.println("Is 817 a Fancy number (1:fancy, 0:notFancy) # " + isFancy(817));
  }
  static int isFancy(int a){
    int currNum=0;
    int prevNum=1;
    int pPrevNum=1;
    boolean isfancy=false;

    if (a<=0) return 0;
    if (a==1) return 1;

    while (currNum < a){
      currNum  = (prevNum * 3) + (pPrevNum * 2);
      pPrevNum = prevNum;
      prevNum  = currNum;

      if (currNum == a) isfancy = true;
    }
    if (isfancy) {
      return 1; 
    } else{
      return 0; 
    }
  }
}











/*
package me.sekayasin;

public class Question10isFancy {

    public static void main(String[] args) {
        System.out.println(isFancy(17));
    }

    static int isFancy(int number) {
        int isFancyNumber = 0;
        int previous = 1;
        int pPrevious = 1;
        int currentNumber = 0;

        if (number == 1) return 1;
        if (number <= 0) return 0;

        for (int i = 0; i < number/2; i++){
            currentNumber = 3*previous + 2*pPrevious;
            if (currentNumber == number) {
                isFancyNumber = 1;
                break;
            } else {
                isFancyNumber = 0;
                pPrevious = previous;
                previous = currentNumber;
            }
        }
        return isFancyNumber;
    }
}
*/


