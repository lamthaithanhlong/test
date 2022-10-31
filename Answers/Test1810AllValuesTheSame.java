package saiPackage;

public class Question62AllValuesTheSame{
    public static void main(String[] args){
        System.out.println("{1, 1, 1, 1}               : " + allValuesTheSame(new int[]{1, 1, 1, 1}));
        System.out.println("{83, 83, 83}               : " + allValuesTheSame(new int[]{83, 83, 83}));
        System.out.println("{0,0,0,0,0,0,0,0,0,0,0}    : " + allValuesTheSame(new int[]{0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println("{1, -2343456, 1, -2343456} : " + allValuesTheSame(new int[]{1, -2343456, 1, -2343456} ));
        System.out.println("{0, 0, 0, 0, -1}           : " + allValuesTheSame(new int[]{0, 0, 0, 0, -1}));
        System.out.println("{432123456}                : " + allValuesTheSame(new int[]{432123456}));
        System.out.println("{-432123456}               : " + allValuesTheSame(new int[]{-432123456}));
        System.out.println("{}                         : " + allValuesTheSame(new int[]{}));
    }

    static int allValuesTheSame(int[] a){
        int ret =1;

        if (a.length == 0) return 0;

        for (int i=0; i<a.length; i++)
            if (a[0] != a[i]) {ret =0; break;} 
        
        return ret;
    }
}

