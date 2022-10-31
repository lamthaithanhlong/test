package saiPackage;

public class Question08nUpCount{
  public static void main(String[] args){
    System.out.println ("n UpCount is : " + nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
  }
  static int nUpCount(int[] numArray, int n){
    int prevPartialSum=0;
    int currPartialSum=0;
    int upcount = 0;

    for(int i=0; i<numArray.length; i++){
      currPartialSum += numArray[i];
      if (prevPartialSum <= n && currPartialSum > n){
        upcount++;
      }
      prevPartialSum = currPartialSum;
    }
    return upcount;
  }


}














/*
package me.sekayasin;

public class Question8nUpCount {

    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
    }

    static int nUpCount(int[] numbers, int number) {
        int upCount = 0;
        int previousPartialSum = 0;
        int currentPartialSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            previousPartialSum = currentPartialSum;
            currentPartialSum += numbers[i];
            if (previousPartialSum <= number && currentPartialSum > number) {
                upCount += 1;
            }
        }
        return upCount;
    }
}
*/
