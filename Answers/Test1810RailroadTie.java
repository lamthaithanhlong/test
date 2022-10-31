package saiPackage;

public class Test1810RailroadTie {
    public static void main(String[] args){
        System.out.println("{1, 2, 0, 3, -18, 0, 2, 2}        : " + isRailroadTie(new int[] {1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println("{1, 2, 0, 1, 2, 0, 1, 2}          : " + isRailroadTie(new int[] {1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println("{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3} : " + isRailroadTie(new int[] {3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println("{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}   : " + isRailroadTie(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

       System.out.println("{1, 2}             : " + isRailroadTie(new int[] {1, 2}));
        System.out.println("{0, 0, 0, 0}       : " + isRailroadTie(new int[] {0, 0, 0, 0}));
        System.out.println("{1, 3, 0, 3, 5, 0} : " + isRailroadTie(new int[] {1, 3, 0, 3, 5, 0}));
        System.out.println("{1, 2, 3, 0, 2, 2} : " + isRailroadTie(new int[] {1, 2, 3, 0, 2, 2}));
        System.out.println("{0, 1, 2, 0, 3, 4} : " + isRailroadTie(new int[] {0, 1, 2, 0, 3, 4}));
        System.out.println("{1, 2, 0, 0, 3, 4} : " + isRailroadTie(new int[] {1, 2, 0, 0, 3, 4}));
        System.out.println("{1}                : " + isRailroadTie(new int[] {1}));
        System.out.println("{}                 : " + isRailroadTie(new int[] {}));
        System.out.println("{0}                : " + isRailroadTie(new int[] {0}));
    }

    static int isRailroadTie(int[] a){
        if (a.length <2) return 0;

       boolean hasNonZero =false;
        int     ret        =1;

        for(int i=0; i<a.length; i++){
            if (a[i]!=0) hasNonZero =true;
       
            if (i==0)
            {
                if (a[i]==0)                   ret =0;
                if ((a[i]!=0) && (a[i+1] ==0)) ret =0;
            }
            else if (i==a.length-1)
            {
               if ( a[a.length-1]==0)                  ret =0;
                if ((a[a.length-1]!=0) && (a[i-1] ==0)) ret =0;
                
            }
            else
            {
                if ((a[i]==0) && (a[i-1] ==0 || a[i+1] ==0)) ret =0;
                
                if (a[i]!=0)
                {
                    if (a[i-1] !=0 && a[i+1] !=0) ret =0;
                    if (a[i-1] ==0 && a[i+1] ==0) ret =0;
                }
            }
        }
       if (!hasNonZero) ret =0;

       return ret;
   }
}