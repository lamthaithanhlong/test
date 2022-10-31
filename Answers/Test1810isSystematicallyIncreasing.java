package saiPackage;

public class Question41isSystematicallyIncreasing{
    public static void main(String[] args){
        System.out.println(" {1}                : " + isSystematicallyIncreasing(new int[] {1}));
        System.out.println(" {1, 2, 1, 2, 3}    : " + isSystematicallyIncreasing(new int[] {1, 2, 1, 2, 3}));
        System.out.println(" {1, 1, 3}          : " + isSystematicallyIncreasing(new int[] {1, 1, 3}));
        System.out.println(" {1, 2, 1, 2, 1, 2} : " + isSystematicallyIncreasing(new int[] {1, 2, 1, 2, 1, 2}));
        System.out.println(" {1, 2, 3, 1, 2, 1} : " + isSystematicallyIncreasing(new int[] {1, 2, 3, 1, 2, 1}));
        System.out.println(" {1, 1, 2, 3}       : " + isSystematicallyIncreasing(new int[] {1, 1, 2, 3}));

System.out.println(" {1, 1, 2} : " + isSystematicallyIncreasing(new int[] {1, 1, 2}));
System.out.println(" {1, 1, 2, 1, 2, 3} : " + isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3}));
System.out.println(" {1, 1, 2, 1, 2, 3, 1, 2, 3, 4} : " + isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
System.out.println(" {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5} : " + isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}));
System.out.println(" {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6} : " + isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
    }

    static int isSystematicallyIncreasing(int[] a){
        if (a[0] != 1) return 0;

        int isSystematic =1;
        int counter      =1;
        int numCheck     =2;
   

        for (int i=1; i<a.length; i++){

            if(a[i] !=counter) { isSystematic =0; break; }

            counter++;

            if (counter > numCheck) {
                numCheck++;
                counter =1;
            }
        } // end of For
        return isSystematic;
    }
}
