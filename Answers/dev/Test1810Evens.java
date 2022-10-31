package saiPackage.dev;



public class Test1810Evens {
    public static void main(String[] args){
        System.out.println("Is 2426 Evens : " + isEvens(2426));
        System.out.println("Is 3224 Evens : " + isEvens(3224));
    }



   static int isEvens(int n){
        int remainder =0;
        int num       =n;
        int ret       =1;



       while (num >0){
            remainder =num%10;
            num /=10;



           if (remainder%2!=0) {ret =0; break;}
        }
        return ret;
    }
}
