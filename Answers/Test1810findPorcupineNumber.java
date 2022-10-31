package saiPackage;

public class Question19findPorcupineNumber{
  public static void main(String[] args){
    System.out.println("Next Porcupine Number of 0 is : " + findPorcupineNumber(0));
    System.out.println("Next Porcupine Number of 3 is : " + findPorcupineNumber(3));
    System.out.println("Next Porcupine Number of 138 is : " + findPorcupineNumber(138));
    System.out.println("Next Porcupine Number of 139 is : " + findPorcupineNumber(139));
    System.out.println("Next Porcupine Number of 140 is : " + findPorcupineNumber(140));
    System.out.println("Next Porcupine Number of 149 is : " + findPorcupineNumber(149));
  }

  static int isPrime(int num){
    int ItIsPrime = 1;

    if (num > 1){

      for(int i=2; i<=num/2; i++){
        if (num%i == 0) {
          ItIsPrime=0;
          break;
        }
      }
    }
    return ItIsPrime;
  }

  static int findPorcupineNumber(int num){
    int currentNum = num;
    boolean foundPorcupineNumber=true;

    if (currentNum<2) currentNum=2;

    while (foundPorcupineNumber){
      currentNum++;

      if (isPrime(currentNum)==1){
        int nextNum = currentNum;
        boolean nextPrimeFound = true;

        while (nextPrimeFound){
          nextNum++;
          if (isPrime(nextNum)==1)
            nextPrimeFound=false;
        } //while end

        if (currentNum%10==9 && nextNum%10==9)
          foundPorcupineNumber=false;
      } // if end
    }//while end

    return currentNum;
  }
}



/*package me.sekayasin;

public class Question19findPorcupineNumber {

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(140));
    }

    static int findPorcupineNumber(int number) {
        int porcupineNumber = 0;
        int maxValue = Integer.MAX_VALUE;
        boolean isPorcupineNumber = false;
        number++;

        while (number <= maxValue) {
            if (isPorcupineNumber) {
                if (isPrime(number) == 1) {
                    if (number % 10 == 9) break;
                    else isPorcupineNumber = false;
                }
            } else {
                if (isPrime(number) == 1) {
                    if (number % 10 == 9) {
                        isPorcupineNumber = true;
                        porcupineNumber = number;
                    }
                }
            }
            number++;
        }
        return porcupineNumber;
    }

    static int isPrime(int number) {
        int isPrime = 0;
        if (number > 1) {
            isPrime = 1;
            for (int i = 2; i*2 <= number; i++) {
                if (number % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        return isPrime;
    }
}
*/
