package saiPackage;

public class Test1810Exponent {
    public static void main(String[] args){
        System.out.println("n =   27, p = 3 : " + getExponent(27,3));
        System.out.println("n =   28, p = 3 : " + getExponent(28,3));
        System.out.println("n =  280, p = 7 : " + getExponent(280,7));
        System.out.println("n = -250, p = 5 : " + getExponent(-250,5));
        System.out.println("n =   18, p = 1 : " + getExponent(18,1));
        System.out.println("n =  128, p = 4 : " + getExponent(128,4));
    }

   static int getExponent(int n, int p){
        if (p<2) return -1;
        int divisor =1;
        int exp     =0;

       while(divisor < Math.abs(n)){
            divisor *=p;
           if (n%divisor ==0) exp++;
        }
       return exp;
    }
}