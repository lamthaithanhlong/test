package saiPackage;

public class Question16isMadhavArray{
  public static void main(String[] args){
    System.out.println("Is {2,1,1} Madhav array : " + (isMadhavArray(new int[]{2,1,1})));
    System.out.println("Is {2,1,1,4,-1,-1} Madhav array : " + (isMadhavArray(new int[]{2,1,1,4,-1,-1})));
    System.out.println("Is {6,2,4,2,2,2,1,5,0,0} Madhav array : " + (isMadhavArray(new int[]{6,2,4,2,2,2,1,5,0,0})));
    System.out.println("Is {18,9,10,6,6,6} Madhav array : " + (isMadhavArray(new int[]{18,9,10,6,6,6})));
    System.out.println("Is {-6,-3,-3,8,-5,-4} Madhav array : " + (isMadhavArray(new int[]{-6,-3,-3,8,-5,-4})));
    System.out.println("Is {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1} Madhav array : " + (isMadhavArray(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1})));
    System.out.println("Is {3,1,2,3,0} Madhav array : " + (isMadhavArray(new int[]{3,1,2,3,0})));
  }
  
  static int isMadhavArray(int[] a){

    if (a.length < 3) return 0;

    /* Madhav length check*/
    int lengthCheck=0;

    for (int i=0; i<a.length; i++)
      if (a.length==(i*(i+1)/2))
        lengthCheck = 1;

    if (lengthCheck==0) return 0;

    /* Is Madhav Array check */
    int isMadhav = 1;
    int firstValue = a[0];
    int round = 1;
    int start = 1;
    int end = start + round;
   
    while (isMadhav==1 && end<=a.length){
//      System.out.println("Start="+start+ ", end="+end +", round="+round); 
      int sumValue = 0;
      for (int i=start; i<=end; i++){
        sumValue += a[i]; 
      }
      if (firstValue != sumValue){
        isMadhav = 0;
      }
      round++;
      start = end + 1;
      end = start + round;
    }
    return isMadhav;   
  }
}




/*
package me.sekayasin;

public class Question16isMadhavArray {

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2,1,1}));
    }

    static int isMadhavArray(int[] a) {
        int isMadhav = 1;
        int isMadhavLength = 0;

        if (a.length < 3) return 0;

        for (int i = 1; i <= a.length; i++) {
            if (a.length == i*(i+1)/2) {
                isMadhavLength = 1;
            }
        }
        if (isMadhavLength == 0) return 0;

        int startIndex = 1;
        int round = 1;
        int endIndex = startIndex + round;
        int firstValue = a[0];

        while (isMadhav == 1 && endIndex <= a.length) {
            int sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += a[i];
            }
            if (firstValue != sum)
                isMadhav = 0;

            round++;
            startIndex = endIndex + 1;
            endIndex = startIndex + round;
        }
        return isMadhav;
    }
}
*/
