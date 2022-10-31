package saiPackage.dev;

public class Test1810NUnique {
    public static void main(String[] args){
        System.out.println("{7,3,3,2,4},  6 : " + isNUnique(new int[]{7,3,3,2,4},  6));
        System.out.println("{7,3,3,2,4}, 10 : " + isNUnique(new int[]{7,3,3,2,4}, 10));
        System.out.println("{7,3,3,2,4}, 11 : " + isNUnique(new int[]{7,3,3,2,4}, 11));
        System.out.println("{7,3,3,2,4},  8 : " + isNUnique(new int[]{7,3,3,2,4},  8));
        System.out.println("{7,3,3,2,4},  4 : " + isNUnique(new int[]{7,3,3,2,4},  4 ));
        System.out.println("{1}        ,  1 : " + isNUnique(new int[]{1}        ,  1));
    }

    static int isNUnique(int[] a, int n){
        int count =0;

        for (int i=0; i<a.length-1; i++){
            for (int j=i+1; j<a.length; j++){
                if ((a[i]+a[j]) == n) count++;
            }
        }

        if (count ==1) return 1;
        else           return 0;
    }
}

