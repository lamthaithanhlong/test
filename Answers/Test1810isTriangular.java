package saiPackage;

public class Question50isTriangular{
    public static void main(String[] args){
        System.out.println("Is  1 Triangular : " + isTriangular(1));
        System.out.println("Is  3 Triangular : " + isTriangular(3));
        System.out.println("Is  6 Triangular : " + isTriangular(6));
        System.out.println("Is 10 Triangular : " + isTriangular(10));
        System.out.println("Is 11 Triangular : " + isTriangular(11));
        System.out.println("Is 15 Triangular : " + isTriangular(15));
    }

    static int isTriangular(int n){
        int ans   =0;
        int count =0;
        int ret   =0;

        while (ans <= n){
            count++;
            ans +=count;
            if (ans==n) ret=1;
        }
        return ret;
    }

}
