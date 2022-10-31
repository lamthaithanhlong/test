package saiPackage.dev;



public class Test1810IsCentered2 {
    public static void main(String[] args){
        System.out.println("{5, 3, 3, 4, 5}    : " + isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println("{3, 2, 1, 4, 5}    : " + isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println("{3, 2, 1, 4, 1}    : " + isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println("{3, 2, 1, 1, 4, 6} : " + isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println("{}                 : " + isCentered(new int[]{}));
        System.out.println("{1}                : " + isCentered(new int[]{1}
));
    }



   static int isCentered(int[] a){



       if (a.length%2 ==0) return 0;
        if (a.length   ==1) return 1;



       int ret =1;
        int mid = a.length/2;



       for(int i=0; i<a.length; i++)
            if (i!=mid)
                if(a[i] <=a[mid]) { ret =0; break; }



       return ret;
    }
}
