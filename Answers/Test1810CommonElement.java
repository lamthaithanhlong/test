package saiPackage;

import java.util.Arrays;

public class Test1810CommonElement {
  public static void main(String args[]){
    System.out.println("{1,8,3,2}, {4,2,6,1} : " + Arrays.toString(commonElement(new int[]{1,8,3,2}, new int[]{4,2,6,1})));
    System.out.println("{1,8,3,2,6}, {2,6,1} : " + Arrays.toString(commonElement(new int[]{1,8,3,2,6}, new int[]{2,6,1})));
    System.out.println("{1,3,7,9}, {7,1,9,3} : " + Arrays.toString(commonElement(new int[]{1,3,7,9}, new int[]{7,1,9,3})));
    System.out.println("{1,2}, {3,4}         : " + Arrays.toString(commonElement(new int[]{1,2}, new int[]{3,4})));
    System.out.println("{}, {1,2,3}          : " + Arrays.toString(commonElement(new int[0], new int[]{1,2,3})));
    System.out.println("{1,2}, {}            : " + Arrays.toString(commonElement(new int[]{1,2}, new int[0])));
    System.out.println("{1,2}, null          : " + Arrays.toString(commonElement(new int[]{1,2}, null)));
    System.out.println("null, {}             : " + Arrays.toString(commonElement(null, new int[0])));
    System.out.println("null, null           : " + Arrays.toString(commonElement(null, null)));
  }

  static int[] commonElement(int[] first, int[] second){
    int[] ret = {9,9,9};
    int minLen=0;
    int[] firstClone, secondClone;

    if (first==null || second==null) return null;
    if (first.length == 0 || second.length ==0) return (new int[0]);

    minLen = (first.length < second.length) ? first.length: second.length;
    
    if (minLen == first.length){
        firstClone = first;
        secondClone = second;
    }
    else {
        firstClone = second;
        secondClone = first;
    }

    int[] filter= new int[minLen];
    int count=0;

    for (int i=0; i<firstClone.length; i++){
      for (int j=0; j<secondClone.length; j++){
        if (firstClone[i] == secondClone[j]){
          filter[count] = firstClone[i];
          count++;
        }
      }
    }

    int[] i_commonElement = new int[count];
    for (int i=0; i<i_commonElement.length; i++)
      i_commonElement[i] = filter[i];

    return (i_commonElement);
  }

}
/*
package me.sekayasin;

import java.util.Arrays;

public class Question5 {

    public static void main(String[] args) {
        System.out.println(commonElements(new int[]{1,8,3,2}, new int[]{2,6,1}));
    }

    static String commonElements(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null)
            return null;
        if (firstArray.length == 0 || secondArray.length == 0)
            return Arrays.toString(new int[0]);
        int min = (firstArray.length < secondArray.length) ? firstArray.length : secondArray.length;
        int[] firstClone, secondClone;
        if (min == firstArray.length) {
            firstClone = firstArray;
            secondClone = secondArray;
        } else {
            firstClone = secondArray;
            secondClone = firstArray;
        }
        int[] retArray = new int[min];
        int count = 0;
        for (int i = 0; i < firstClone.length; i++){
            for (int j = 0; j < secondClone.length; j++) {
                if (firstClone[i] == secondClone[j]) {
                    retArray[count] = firstClone[i];
                    count++;
                }
            }
        }
        int[] commonElements = new int[count];
        for (int i = 0; i < commonElements.length; i++) {
            commonElements[i] = retArray[i];
        }

        return Arrays.toString(commonElements);
    }
}
*/
