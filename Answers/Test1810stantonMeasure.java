package saiPackage;

public class Question21stantonMeasure{
  public static void main(String[] args){
    System.out.println("Is {1} stantoMeasure (1:Yes, 0:No) # " + stantonMeasure(new int[]{1}));
    System.out.println("Is {0} stantoMeasure (1:Yes, 0:No) # " + stantonMeasure(new int[]{0}));
    System.out.println("Is {3,1,1,4} stantoMeasure (1:Yes, 0:No) # " + stantonMeasure(new int[]{3,1,1,4}));
    System.out.println("Is {1,3,1,1,3,3,2,3,3,3,4} stantoMeasure (1:Yes, 0:No) # " + stantonMeasure(new int[]{1,3,1,1,3,3,2,3,3,3,4}));
    System.out.println("Is {} stantoMeasure (1:Yes, 0:No) # " + stantonMeasure(new int[]{}));

  }
  
  static int stantonMeasure(int[] a){
    int x=1; int y=0;
    int numOfTimesOccurance_x=0;
    int numOfTimesOccurance_y=0;

    for (int i=0; i<a.length; i++){
      if (a[i]==1)
        numOfTimesOccurance_x++; 
    }

    y = numOfTimesOccurance_x;

    for (int i=0; i<a.length; i++){
      if (a[i]==y)
        numOfTimesOccurance_y++; 
    }

    return numOfTimesOccurance_y;
  }

}




/*
package me.sekayasin;

public class Question21stantonMeasure {

    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1,3,1,1,3,3,2,3,3,3,4}));
    }

    static int stantonMeasure(int[] a) {
        int stantonMeasure = 0;
        int occurrencesOfOne = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                occurrencesOfOne++;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == occurrencesOfOne)
                stantonMeasure++;
        }

        return stantonMeasure;
    }
}
*/
