package saiPackage;

public class Question66AllPossibilities{
    public static void main(String[] args){
        System.out.println("{1, 2, 0, 3} : " + isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println("{3, 2, 1, 0} : " + isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println("{1, 2, 4, 3} : " + isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println("{0, 2, 3}    : " + isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println("{0}          : " + isAllPossibilities(new int[]{0}));
        System.out.println("{}           : " + isAllPossibilities(new int[]{}));
    }

    static int isAllPossibilities(int[] a){
        int result =1;

        if (a.length == 0) return 0;

        for(int i=0; i<a.length; i++){
            if (a[i] > a.length -1) { result =0; break; }

            // check duplicates
            for(int j=0; j<a.length; j++){
                if (i !=j)
                if (a[i] == a[j]) {result =0; break;}
            }
        }

        return result;
    }
}


