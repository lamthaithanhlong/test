package saiPackage.dev;

public class Test1810FullnessQuotient {
    public static void main(String[] args){
        System.out.println("Fullness Quotient of  94 is : " + fullnessQuotient( 94));
        System.out.println("Fullness Quotient of   1 is : " + fullnessQuotient(  1));
        System.out.println("Fullness Quotient of   9 is : " + fullnessQuotient(  9));
        System.out.println("Fullness Quotient of 360 is : " + fullnessQuotient(360));
        System.out.println("Fullness Quotient of  -4 is : " + fullnessQuotient( -4));
        System.out.println("Fullness Quotient of   0 is : " + fullnessQuotient(  0));
   }

   static int fullnessQuotient(int n){

       if (n<0)  return -1;
        if (n==0) return 0;

       int remainder =0;
        int count     =0;
        int num       =n;

       boolean found =false;

       for (int divisor=2; divisor<10; divisor++){
            num   =n;
            found =false;
            while (num >0){
                remainder =num%divisor;
                num      /=divisor;
    
                if (remainder ==0) found =true;
            }
            if (!found) count++;
        }
       return count;
    }
}