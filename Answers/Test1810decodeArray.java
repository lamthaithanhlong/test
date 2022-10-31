package saiPackage;

public class Question34decodeArray{
    public static void main(String[] args){
        System.out.println("Decode Array of {0, -3, 0, -4, 0}     : " + decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println("Decode Array of {-1, 5, 8, 17, 15}    : " + decodeArray(new int[] {-1, 5, 8, 17, 15}));
        System.out.println("Decode Array of {1, 5, 8, 17, 15}     : " + decodeArray(new int[] {1, 5, 8, 17, 15}));
        System.out.println("Decode Array of {111,115,118,127,125} : " + decodeArray(new int[] {111,115,118,127,125}));
        System.out.println("Decode Array of {1, 1}                : " + decodeArray(new int[] {1, 1}));
    }

    static int decodeArray(int[] a){
        if (a.length < 2) return 0;

        int absVal =0;
        int decodeNum =0;

        for (int i=0; i<a.length-1; i++){
            absVal = Math.abs(a[i] - a[i+1]);
            decodeNum = decodeNum*10 + absVal;
        }

        if (a[0] < 0) decodeNum *= -1;

        return decodeNum;
    }
}
