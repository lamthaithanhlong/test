package saiPackage.dev;



public class Test1810KSmallFactors {
    public static void main(String[] args){
        System.out.println("Has K Small Factors (10, 20) : " + hasKSmallFactors(10, 20));
        System.out.println("Has K Small Factors ( 7, 22) : " + hasKSmallFactors( 7, 22));
        System.out.println("Has K Small Factors ( 7, 30) : " + hasKSmallFactors( 7, 30));
        System.out.println("Has K Small Factors ( 6, 14) : " + hasKSmallFactors( 6, 14));
        System.out.println("Has K Small Factors ( 6, 30) : " + hasKSmallFactors( 6, 30));
    }



   static int hasKSmallFactors(int k, int n){
        int ret =0;



       for(int i=1; i<k; i++)
            for(int j=1; j<k; j++)
                if (i*j ==n) { ret =1; break; }



       return ret;
    }
} 
