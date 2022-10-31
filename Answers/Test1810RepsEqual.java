package saiPackage;

public class Test1810RepsEqual {
    public static void main(String[] args){
        System.out.println("{3, 2, 0, 5, 3},32053 : " + repsEqual(new int[]{3, 2, 0, 5, 3},32053));
        System.out.println("{3, 2, 0, 5},32053 : " + repsEqual(new int[]{3, 2, 0, 5} ,32053));
        System.out.println("{3, 2, 0, 5, 3, 4},32053 : " + repsEqual(new int[]{3, 2, 0, 5, 3, 4},32053));
        System.out.println("{2, 3, 0, 5, 3},32053 : " + repsEqual(new int[]{2, 3, 0, 5, 3},32053));
        System.out.println("{9, 3, 1, 1, 2},32053 : " + repsEqual(new int[]{9, 3, 1, 1, 2},32053));
        System.out.println("{0, 3, 2, 0, 5, 3},32053 : " + repsEqual(new int[]{0, 3, 2, 0, 5, 3},32053));
    }

    static int repsEqual(int[] a, int n){
        int num =0;

        for (int i=0; i<a.length; i++){
            if (num==0)
                num = a[i];
            else
                num = (num*10) + a[i];
        }

        if ( num == n ) return 1;
        else            return 0;
    }
}

