package saiPackage;

public class Question33cubePowerful{
    public static void main(String[] args){
        System.out.println("Is 153 Cube Powerful (1:Yes, 0:No) # " + isCubePowerful(153));
        System.out.println("Is 370 Cube Powerful (1:Yes, 0:No) # " + isCubePowerful(370));
        System.out.println("Is 371 Cube Powerful (1:Yes, 0:No) # " + isCubePowerful(371));
        System.out.println("Is 407 Cube Powerful (1:Yes, 0:No) # " + isCubePowerful(407));
        System.out.println("Is  87 Cube Powerful (1:Yes, 0:No) # " + isCubePowerful(87));
        System.out.println("Is   0 Cube Powerful (1:Yes, 0:No) # " + isCubePowerful(0));
        System.out.println("Is -81 Cube Powerful (1:Yes, 0:No) # " + isCubePowerful(-18));
    }

    static int isCubePowerful(int n){
        int sum       =0;
        int num       =n;
        int remainder =0;

        if (n<=0) return 0;

        while (num>0){
            remainder = num%10;
            num       = num/10;

            sum += remainder * remainder * remainder;
        }

        if (sum == n) return 1;
        else          return 0;
    }
}
