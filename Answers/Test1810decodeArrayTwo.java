package saiPackage;

public class Question37decodeArrayTwo{
    public static void main(String[] args){
        System.out.println("decode array of {1} is                      :" + decodeArray(new int[]{1}));
        System.out.println("decode array of {0, 1} is                   :" + decodeArray(new int[]{0, 1}));
        System.out.println("decode array of {-1, 0, 1} is               :" + decodeArray(new int[]{-1, 0, 1}));
        System.out.println("decode array of {0, 1, 1, 1, 1, 1, 0, 1} is :" + decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println("decode array of {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1} is :" + decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
    }

    static int decodeArray(int[] a){
        int sign  = 0;
        int start = 0;
        int result = 0;
        int number = 0;

        if (a[0]<0) {sign = -1; start = 1;}
        else        sign = 1;

        for (int i=start; i<a.length; i++){
            if (a[i]==0) {
                number++;
            }else{  // it is 1
                result *= 10;
                result += number;
                number = 0;
            }
        }
        return result*sign;
    }

}
