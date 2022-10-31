package saiPackage;

public class Test1810CountOnes {
    public static void main(String[] args){
        System.out.println("Count 1's for  5 is : " + countOnes(5));
        System.out.println("Count 1's for 15 is : " + countOnes(15));
    }

   static int countOnes(int n){
        int num   =n;
        int count =0;

       while (num>0){
            if (num%2 ==1) count++;
            num /=2;
        }
        return count;
    }
}