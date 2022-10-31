package saiPackage;

public class Test1810IsComplete2 {
    public static void main(String args[]){
        System.out.println("{5, 6, 2, 3, 2, 4, 5, 11, 8, 7} : " + isComplete(new int[]{5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println("{5, 7, 9, 13}                   : " + isComplete(new int[]{5, 7, 9, 13}));
        System.out.println("{2, 2}                          : " + isComplete(new int[]{2, 2}));
        System.out.println("{2, 3, 4}                       : " + isComplete(new int[]{2, 3, 4}));
        System.out.println("{2, 6, 3, 4}                    : " + isComplete(new int[]{2, 6, 3, 4}));
   }

   static int isComplete (int[] a){
        int ret =1;
        int smallestEven =0;
        int biggestEven  =0;

       for(int i=0; i<a.length; i++){
            if (a[i]%2 ==0){
                if      (smallestEven ==0)   { smallestEven =a[i]; biggestEven =a[i];}
                else if (a[i] <smallestEven) { smallestEven =a[i]; }
                else if (a[i] >biggestEven)  { biggestEven  =a[i]; }
            }
        }

       if (smallestEven ==0 && biggestEven ==0) {ret =0;}
        else if (smallestEven ==biggestEven)     {ret =0;}
        else{
            for (int i=smallestEven+1; i<biggestEven; i++){
                boolean found =false;
                for (int j=0; j<a.length; j++){
                    if (a[j] ==i) found =true;
                }
                if (!found) { ret =0; break; }
            }
        }
        return ret;
    }
}
