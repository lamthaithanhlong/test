package saiPackage;



public class Test1810CountDigit {
    public static void main(String[] args){
        System.out.println("(32121,1) : " + countDigit(32121, 1));
        System.out.println("(33331,3) : " + countDigit(33331,3));
        System.out.println("(33331,6) : " + countDigit(33331,6));
        System.out.println("(3,3)     : " + countDigit(3,3));
        System.out.println("(-543,3)  : " + countDigit(-543,3));
    }



   static int countDigit(int n, int digit){
        if (n<0 || digit<0) return 0;
        int count =0;
        int num   =n;
        int remainder =0;



       while (num>0){
            remainder =num%10;
            num /=10;



           if (remainder ==digit) count++;
        }
        return count;
    }



}
