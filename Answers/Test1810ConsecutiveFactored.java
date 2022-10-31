package saiPackage;



public class Question77ConsecutiveFactored{
    public static void main(String[] args){
        System.out.println("Is  24 Conseccutive Factored : " + isConsectiveFactored(24));
        System.out.println("Is 105 Conseccutive Factored : " + isConsectiveFactored(105));
        System.out.println("Is  90 Conseccutive Factored : " + isConsectiveFactored(90));
        System.out.println("Is  23 Conseccutive Factored : " + isConsectiveFactored(23));
        System.out.println("Is  15 Conseccutive Factored : " + isConsectiveFactored(15));
        System.out.println("Is   2 Conseccutive Factored : " + isConsectiveFactored(2));
        System.out.println("Is   0 Conseccutive Factored : " + isConsectiveFactored(0));
        System.out.println("Is -12 Conseccutive Factored : " + isConsectiveFactored(-12));
    }

   static int isConsectiveFactored(int n){
        if (n<2) return 0;

       int num         =n;
        int prev_factor =0;        
        int curr_factor =0;        
        int ret         =0;
        boolean found   = false;

       while(num>0){
            found = false;
            for(int i=2; i<=num/2; i++){
                if(num%i ==0){
                   prev_factor = curr_factor;
                   curr_factor = i;
                   num = num/i;
                   found = true;
                   break;
                }
            }  // end of for

           if (!found){
                prev_factor = curr_factor;
                curr_factor = num;
                num = -1;
            }
            if ( prev_factor>1 && curr_factor>1 && (prev_factor + 1) == curr_factor ){
                ret =1;
                break;
            }
        }   // end of while

       return ret;
    }
}