package saiPackage;

public class Question20isGuthrieSequence{
  public static void main(String[] args){
    System.out.println("Is {8,4,2,1} a GuthrieSequence (1:Yes, 0:No) # " + isGuthrieSequence(new int[]{8,4,2,1}));
    System.out.println("Is {8,17,4,1} a GuthrieSequence (1:Yes, 0:No) # " + isGuthrieSequence(new int[]{8,17,4,1}));
    System.out.println("Is {8,4,1} a GuthrieSequence (1:Yes, 0:No) # " + isGuthrieSequence(new int[]{8,4,1}));
    System.out.println("Is {8,4,2} a GuthrieSequence (1:Yes, 0:No) # " + isGuthrieSequence(new int[]{8,4,2}));
    System.out.println("Is {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1} a GuthrieSequence (1:Yes, 0:No) # " + isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
  }

  static int isGuthrieSequence(int[] a){
    if (a[0] < 1) return 0;
    if (a[a.length - 1] != 1) return 0;

    int nextGuthrieNumber=0;
    int isGuthrieArray   =1;

    for (int i=0; i<a.length-1; i++){
      if (a[i]%2 == 0){   // even
        nextGuthrieNumber = a[i]/2;
      }else{
        nextGuthrieNumber = (a[i]*3) + 1;
      }

      if (nextGuthrieNumber != a[i+1]){
        isGuthrieArray = 0;
        break;
      }
    }
    
    return isGuthrieArray;
  }
}



/*
package me.sekayasin;

public class Question20isGuthrieSequence {

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8,17,2,1}));
    }

    static int isGuthrieSequence(int[] a) {
        int isGuthrieSequence = 1;
        if (a[a.length - 1] != 1) return 0;

        int[] guthrieArray = new int[a.length];
        guthrieArray[0] = a[0];
        guthrieArray[guthrieArray.length - 1] = a[a.length - 1];

        for (int i = 0, idx = 1; i <= a.length - 2; i++, idx++) {
            if (a[i] % 2 == 0)
                guthrieArray[idx] = a[i]/2;
            else
                guthrieArray[idx] = a[i]*3 + 1;
        }

        for (int i = 0; i < guthrieArray.length; i++) {
            if (guthrieArray[i] != a[i]) {
                isGuthrieSequence = 0;
                break;
            }
        }

        return isGuthrieSequence;
    }
}
*/
