package saiPackage;

public class Question65Polynomial{
    public static void main(String[] args){
        System.out.println(" 1.0,{0,1,2,3,4} : " + eval( 1.0,new int[]{0,1,2,3,4} ));
        System.out.println(" 3.0,{3, 2, 1}   : " + eval( 3.0,new int[]{3, 2, 1}));
        System.out.println(" 2.0,{3, -2, -1} : " + eval( 2.0,new int[]{3, -2, -1}));
        System.out.println(" -3.0,{3, 2, 1}  : " + eval( -3.0,new int[]{3, 2, 1}));
        System.out.println(" 2.0,{3, 2}      : " + eval( 2.0,new int[]{3, 2}));
        System.out.println(" 2.0,{4, 0, 9}   : " + eval( 2.0,new int[]{4, 0, 9}));
        System.out.println(" 2.0,{10}        : " + eval( 2.0,new int[]{10}));
        System.out.println(" 10.0,{0, 1}     : " + eval( 10.0,new int[]{0, 1}));
    }

    static double eval(double x, int[] a){
        double result =0.0;

        for(int i=0;i<a.length; i++){
            double x_power =1;

            for (int j=1; j<=i; j++)
                x_power *= x;

            result += (a[i] * x_power);
        }

        return result;
    }
}

