package saiPackage.dev;



public class Test1810MeeraArray {
    public static void main(String[] args){
       System.out.println("{3, 5, 2} : " + isMeera(new int[]{3, 5, 2}));
        System.out.println("{8, 3, 4} : " + isMeera(new int[]{8, 3, 4}));
    }



   static int isMeera(int[] a){
        int ret =1;
       for(int i=0; i<a.length; i++)
            for(int j=0; j<a.length; j++)
                if(a[i]*2 ==a[j]) ret =0;
       return ret;
    }
}
