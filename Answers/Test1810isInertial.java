package saiPackage;
import java.util.Arrays;

public class Question17isInertial{
  public static void main(String[] args){
    System.out.println("Is {1} inertial : " + isInertial(new int[]{1}));
    System.out.println("Is {2} inertial : " + isInertial(new int[]{2}));
    System.out.println("Is {1,2,3,4} inertial : " + isInertial(new int[]{1,2,3,4}));
    System.out.println("Is {1,1,1,1,1,1,2} inertial : " + isInertial(new int[]{1,1,1,1,1,1,2}));
    System.out.println("Is {2,12,4,6,8,11} inertial : " + isInertial(new int[]{2,12,4,6,8,11}));
    System.out.println("Is {2,12,12,4,6,8,11} inertial : " + isInertial(new int[]{2,12,12,4,6,8,11}));
    System.out.println("Is {-2,-4,-6,-8,-11} inertial : " + isInertial(new int[]{-2,-4,-6,-8,-11}));
    System.out.println("Is {2,3,5,7} inertial : " + isInertial(new int[]{2,3,5,7}));
    System.out.println("Is {2,4,6,8,10} inertial : " + isInertial(new int[]{2,4,6,8,10}));
  }

  static int isInertial(int[] a){
    //a. it contains at least one odd value
    int oneOddValueCheck = 0;
    for (int i=0; i<a.length; i++)
      if (a[i]%2 != 0) oneOddValueCheck = 1;
    if (oneOddValueCheck == 0) return 0;
     
    //b. the maximum value in the array is even
    int  maxValue=0;
    for (int i=0; i<a.length; i++){
      if (maxValue < a[i])
        maxValue = a[i];
    }
    if (maxValue%2 != 0) return 0;
   
    //c. every odd value is greater than every even value that is not the maximum value.
    //so {11,4,20,9,2,8} is inertial because
    // - it contains at least one odd value
    // - the maximum value in the array is 20 which is even
    // - the two odd values (11 and 9) are greater than all the even values that are not
    //equal to 20 (the maximum), i.e {4,2,8}.
    //However, {12,11,4,9,2,3,10} is not inertial because it fails condition (c), i.e.
    //10 (which is even) is greater than 9 (which is odd), and 10 is not the maximum value
    //in the array.
    int[] tempOddArray = new int[a.length];
    int[] tempEvenArray = new int[a.length];
    int oddArrayIndex = 0;
    int evenArrayIndex = 0;

    for (int i=0; i<a.length; i++){
      if (a[i]%2 == 0 && a[i] != maxValue) {
        tempEvenArray[evenArrayIndex++] = a[i]; 
      }

      if (a[i]%2 != 0) {
        tempOddArray[oddArrayIndex++] = a[i]; 
      }
    }

    int[] oddArray  = new int[oddArrayIndex];
    int[] evenArray = new int[evenArrayIndex];

    for (int i=0; i<oddArrayIndex; i++)
      oddArray[i] = tempOddArray[i];

    for (int i=0; i<evenArrayIndex; i++)
      evenArray[i] = tempEvenArray[i];

    System.out.println ("Odd Array is : " + Arrays.toString(oddArray));
    System.out.println ("Even Array is : " + Arrays.toString(evenArray));

    for (int i=0; i<oddArray.length; i++){
      for (int j=0; j<evenArray.length; j++){
        if (oddArray[i] < evenArray[j]) return 0;
      } 
    }

    return 1;
  }

}



/*
package me.sekayasin;

public class Question17isInertial {

    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1,2,3,4}));
    }

    static String isInertial(int[] a){
        int isInertial = 1;
        int hasAtleastOneOdd = 0;
        int maxNumberIsEven = 0;
        int maxNumber = a[0];
        int lengthOdd = 0;
        int lengthEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 || a[i] % 2 == -1) {
                hasAtleastOneOdd = 1;
                lengthOdd++;
            } else lengthEven++;
        }
        if (hasAtleastOneOdd == 0) return 0 + " no odd value";

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    if (a[i] > maxNumber) maxNumber = a[i];
                }
            }
        }
        if (maxNumber % 2 == 0 || maxNumber % 2 == -0) {
            maxNumberIsEven = 1;
        }
        if (maxNumberIsEven == 0) return 0 + " max number is not even, " + maxNumber + " is the max number";

        int[] oddValues = new int[lengthOdd];
        int[] evenValues = new int[lengthEven];
        int oddIdx = 0;
        int evenIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 2 == -0) {
                evenValues[evenIdx] = a[i];
                evenIdx++;
            } else {
                oddValues[oddIdx] = a[i];
                oddIdx++;
            }
        }

        for (int i = 0; i < oddValues.length; i++) {
            for (int j = 0; j < evenValues.length; j++) {
                if (evenValues[j] != maxNumber) {
                    if (oddValues[i] < evenValues[j]) {
                        isInertial = 0;
                        return isInertial + " some odd value is not greater than some even value which is not the Max number";
                    }
                }
            }
        }
        return isInertial + " is Intertial";
    }
}
*/
