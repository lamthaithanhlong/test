package saiPackage;

public class Test1810ComputeDepth {
    public static void main(String[] args){
        System.out.println ("42 : " + computeDepth(42));
        System.out.println (" 7 : " + computeDepth( 7));
	System.out.println ("13 : " + computeDepth(13));
        System.out.println ("25 : " + computeDepth(25));
    }

    static int computeDepth(int n){
        int     depth     =0;
        int     result    =0;
        int     remainder =0;
        boolean loop      =true;
        boolean found     =true;

        int[] a = new int[]{ 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

        while (loop){
            depth++;
            result = n * depth;
            while (result>0){
                remainder = result%10;
                result    = result/10;
                a[remainder] = remainder;
            }         

            found     = true;

            for (int i=0; i<a.length; i++){
                if (a[i]!=i) found = false;
            }

            if (found) loop = false;
        }

        return depth;
    }

}
