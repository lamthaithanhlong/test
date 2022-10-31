package saiPackage.dev;

public class Test1810BEQnumber {
   public static void main(String[] args){
        System.out.println("Smallest BEQ number is : " + findSmallestBEQnumber());
    }

   static int findSmallestBEQnumber(){
        int BEQ =0;
        int num =717;

        while (BEQ==0){
            int result    = num*num*num;
            int remainder = -1;
            int countSix  = 0;

           while (result>0){
                if (result%10 ==6) countSix++;
                result /=10;
            }

           if (countSix ==4) BEQ =num;
            else  num++;
        }

       return BEQ;
    }
}