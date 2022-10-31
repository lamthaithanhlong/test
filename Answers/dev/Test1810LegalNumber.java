package saiPackage.dev;

public class Test1810LegalNumber {
    public static void main(String[] args){
        System.out.println("{1, 0, 1, 1}, 2 : " + convertToBase10(new int[]{1, 0, 1, 1}, 2));
        System.out.println("{1, 1, 2}   , 3 : " + convertToBase10(new int[]{1, 1, 2}, 3));
        System.out.println("{3, 2, 5}   , 8 : " + convertToBase10(new int[]{3, 2, 5}, 8));
        System.out.println("{3, 7, 1}   , 6 : " + convertToBase10(new int[]{3, 7, 1}, 6));
    }

    static int convertToBase10(int[] a, int base){
        if (isLegalNumber(a, base)==0) return 0;

        int base10 =0;

        for(int i=a.length-1, j=0; i>=0; i--, j++){
            int basePower =1;

            for (int k=1; k<=j; k++) basePower *=base;

            base10 += (a[i]*basePower);
        }

        return base10;
    }

    static int isLegalNumber(int[] a, int base){
        int ret =1;

        for (int i=0; i<a.length; i++){
            if (a[i] > base) {
                ret =0; break;
            }
        }

        return ret;
    }

}

