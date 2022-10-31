package saiPackage.dev;

public class Test1810SetEqual {
    public static void main(String[] args){
        System.out.println("{1, 9, 12}, {12, 1, 9}                 : " + isSetEqual(new int[]{1, 9, 12}, new int[]{12, 1, 9} ));
        System.out.println("{9, 1, 12, 1}, {1, 9, 12, 9, 12, 1, 9} : " + isSetEqual(new int[]{9, 1, 12, 1}, new int[]{1, 9, 12, 9, 12, 1, 9}));
        System.out.println("{1, 7, 8}, {1, 7, 1}                   : " + isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 1}));
        System.out.println("{1, 7, 8}, {1, 7, 6}                   : " + isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 6}));
    }

    static int isSetEqual(int[] a, int[] b){
        int     ret   =1;
        boolean found =false;

        for(int i=0; i<a.length; i++){
            found =false; 
            for(int j=0; j<b.length; j++){
                if (a[i] ==b[j]) found =true;
            }
            if (!found) { ret =0; break; }
        }
        if (ret ==0) return ret;

        for(int i=0; i<b.length; i++){
            found =false; 
            for(int j=0; j<a.length; j++){
                if (b[i] ==a[j]) found =true;
            }
            if (!found) { ret =0; break; }
        }

        return ret;
    }

}

