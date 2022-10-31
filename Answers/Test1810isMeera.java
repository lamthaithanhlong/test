package saiPackage;

public class Test1810isMeera {
  public static void main(String[] args){
    System.out.println("Is {7,9,0,10,1} a Meera array (1:Yes, 0:No)      # " + isMeera(new int[]{7,9,0,10,1}));
    System.out.println("Is {6,10,8} a Meera array (1:Yes, 0:No)          #" + isMeera(new int[]{6,10,8}));
    System.out.println("Is {7,6,1} a Meera array (1:Yes, 0:No)           #" + isMeera(new int[]{7,6,1}));
    System.out.println("Is {9,10,0} a Meera array (1:Yes, 0:No)          #" + isMeera(new int[]{9,10,0}));
    System.out.println("Is {1,1,0,8,0,9,9,1} a Meera array (1:Yes, 0:No) #" + isMeera(new int[]{1,1,0,8,0,9,9,1}));
  }
  static int isMeera(int[] a){
    boolean hasOne =false;
    boolean hasNine=false;

    for(int i=0; i<a.length; i++){
      if(a[i] == 1) hasOne=true;
      if(a[i] == 9) hasNine=true;
    }
    if (hasOne && hasNine) 
      return 1;
    else if (!hasOne && !hasNine)
      return 1;
    else 
      return 0;
  }
}


/*
package me.sekayasin;

public class Question11isMeera {

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{9,10,1}));
    }

    static int isMeera(int[] a) {
        int isMeeraArray = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 || a[i] == 9) {
                if (a[i] == 1) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 9) {
                            isMeeraArray = 1;
                            return isMeeraArray;
                        }
                    }
                    isMeeraArray = 0;
                    return isMeeraArray;
                }
                if (a[i] == 9) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 1) {
                            isMeeraArray = 1;
                            return isMeeraArray;
                        }
                    }
                    isMeeraArray = 0;
                    return isMeeraArray;
                }
            }
        }
        return isMeeraArray;
    }
}
*/
