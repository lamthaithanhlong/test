package saiPackage.dev;

public class Test1810Twin {
    public static void main(String[] args){
        System.out.println("{3, 5, 8, 10, 27}     : " + isTwin(new int[]{3, 5, 8, 10, 27}));
        System.out.println("{11, 9, 12, 13, 23}   : " + isTwin(new int[]{11, 9, 12, 13, 23}));
        System.out.println("{5, 3, 14, 7, 18, 67} : " + isTwin(new int[]{5, 3, 14, 7, 18, 67}));
        System.out.println("{13, 14, 15, 3, 5}    : " + isTwin(new int[]{13, 14, 15, 3, 5}));
        System.out.println("{1, 17, 8, 25, 67}    : " + isTwin(new int[]{1, 17, 8, 25, 67}));
    }

    static int isTwin(int[] a){
        int     ret     =1;
        boolean hasTwin =false;

        for(int i=0; i<a.length; i++){
            if (isPrime(a[i]) ==1){
                hasTwin =false;
                for(int j=0; j<a.length; j++){
                    if (isPrime(a[j]) ==1 && i!=j){
                        if (Math.abs(a[i] - a[j]) ==2) hasTwin =true;
                    }
                }
                if (!hasTwin) { ret =0; break;}
            }
            if (ret ==0) break;
        }
        return ret;
    }

    static int isPrime(int n){
        int ret =1;

        if (n<2) return 0;

        for(int i=2; i<=n/2; i++)
            if(n%i ==0) { ret =0; break; }

        return ret;
    }

}

