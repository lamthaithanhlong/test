package saiPackage.dev;

public class Test1810Normal {
    public static void main(String[] args){
        System.out.println("Is 1 normal : " + isNormal(1));
        System.out.println("Is 2 normal : " + isNormal(2));
        System.out.println("Is 3 normal : " + isNormal(3));
        System.out.println("Is 4 normal : " + isNormal(4));
        System.out.println("Is 5 normal : " + isNormal(5));
        System.out.println("Is 6 normal : " + isNormal(6));
        System.out.println("Is 7 normal : " + isNormal(7));
        System.out.println("Is 8 normal : " + isNormal(8));
        System.out.println("Is 9 normal : " + isNormal(9));
    }

   static int isNormal(int n){
        int ret =1;

       for (int i=1; i<=n; i++){
            if ( n%i ==0 && i!=1 && i!=n && i%2==1)
                ret =0;
        }

       return ret;
    }
}