package saiPackage;

public class Question36isDigitIncreasing{
    public static void main(String[] args){
        System.out.println("Is    7 digit increasing : " + isDigitIncreasing(7));
        System.out.println("Is   36 digit increasing : " + isDigitIncreasing(36));
        System.out.println("Is  984 digit increasing : " + isDigitIncreasing(984));
        System.out.println("Is 7404 digit increasing : " + isDigitIncreasing(7404));
        System.out.println("Is 7777 digit increasing : " + isDigitIncreasing(7777));
    }

    static int isDigitIncreasing(int n){
        int multiplier = 1;
        int num =n;
        int result =0;
        
        for (int i=1; i<10; i++){
            num =n;
            multiplier =1;
            result = 0;
            result += i*multiplier;
            System.out.print("result = " + i*multiplier);

            while (num>0){
                num = num/10;

                if (num!=0)
                {
                    multiplier = multiplier*10 + 1;
                    result += i*multiplier;
                    System.out.print("+ " + i*multiplier);
                }
            }
            System.out.print(" = " + result + "\n");


            if (result == n) return 1 ;
        } 

        return 0;
    }
}
