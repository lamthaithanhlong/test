package saiPackage;

public class Question64SameNumberOfFactors{
    public static void main(String[] args){
        System.out.println("-6,21 : " + sameNumberOfFactors(-6,21));
        System.out.println(" 6,21 : " + sameNumberOfFactors( 6,21));
        System.out.println(" 8,12 : " + sameNumberOfFactors( 8,12));
        System.out.println("23,97 : " + sameNumberOfFactors(23,97));
        System.out.println(" 0, 1 : " + sameNumberOfFactors( 0,1));
        System.out.println(" 0, 0 : " + sameNumberOfFactors( 0,0));
    }

    static int sameNumberOfFactors(int n1, int n2){
        if (n1<0 || n2<0) return -1;

        int n1_factor_count =findFactorCount(n1);
        int n2_factor_count =findFactorCount(n2);

        if (n1_factor_count == n2_factor_count) 
            return 1;
        else       
            return 0;
    }
 
    static int findFactorCount(int n){
        int count =0;

        for(int i=1; i<=n; i++)
            if(n%i == 0) 
                count++;
  
        return count;
    }

}
