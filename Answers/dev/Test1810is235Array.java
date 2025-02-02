package saiPackage.dev;

public class Test1810is235Array {
    public static void main(String[] args){
        System.out.println("{2, 3, 5, 7, 11}             : " + is235Array(new int[] {2, 3, 5, 7, 11}));
        System.out.println("{2, 3, 6, 7, 11}             : " + is235Array(new int[] {2, 3, 6, 7, 11}));
        System.out.println("{2, 3, 4, 5, 6, 7, 8, 9, 10} : " + is235Array(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("{2, 4, 8, 16, 32}            : " + is235Array(new int[] {2, 4, 8, 16, 32}));
        System.out.println("{3, 9, 27, 7, 1, 1, 1, 1, 1} : " + is235Array(new int[] {3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println("{7, 11, 77, 49}              : " + is235Array(new int[] {7, 11, 77, 49}));
        System.out.println("{2}                          : " + is235Array(new int[] {2}));
        System.out.println("{}                           : " + is235Array(new int[] {}));
        System.out.println("{7,2,7,2,7,2,7,2,3,7,7}      : " + is235Array(new int[] {7,2,7,2,7,2,7,2,3,7,7}));
    }

    static int is235Array(int[] a){
        int ret      =1;
        int count    =0;
        int nonCount =0;

        for (int i=0; i<a.length; i++){
            if (a[i]%2==0) count++;
            if (a[i]%3==0) count++;
            if (a[i]%5==0) count++;

            if (a[i]%2!=0 && a[i]%3!=0 && a[i]%5!=0) nonCount++;
        }

        if ((count + nonCount) != a.length) ret =0;

        return ret;
    }

}


