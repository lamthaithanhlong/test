package saiPackage;



public class Question72CheckConcatenatedSum{
    public static void main(String[] args){
        System.out.println("(  198,2) is : " + checkConcatenatedSum(  198,2));
        System.out.println("(  198,3) is : " + checkConcatenatedSum(  198,3));
        System.out.println("( 2997,3) is : " + checkConcatenatedSum( 2997,3));
        System.out.println("( 2997,2) is : " + checkConcatenatedSum( 2997,2));
        System.out.println("(13332,4) is : " + checkConcatenatedSum(13332,4));
        System.out.println("(    9,1) is : " + checkConcatenatedSum(    9,1));
   }

    static int checkConcatenatedSum(int n, int catlen){
        int remainder  =0;
        int tmp_catlen =0;
        int num        =n;
        int result_one =0;
        int result     =0;

       while(num!=0){
            remainder  = num%10;
            num        = num/10;
            result_one = 0;
            tmp_catlen =catlen;

           while(tmp_catlen!=1){
                result_one = remainder;
    
                for(int i=1; i< tmp_catlen; i++)
                    result_one*=10;

               result+= result_one;
                tmp_catlen--;
            }
            result+= remainder;
        }
        if (result == n)
            return 1;
        else
            return 0;
    }
}