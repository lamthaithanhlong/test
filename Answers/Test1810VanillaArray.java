package saiPackage;

public class Test1810VanillaArray {
    public static void main(String[] args){
        System.out.println(" {1} : " + isVanilla(new int[] {1}));
        System.out.println(" {11, 22, 13, 34, 125} : " + isVanilla(new int[] {11, 22, 13, 34, 125}));
        System.out.println(" {9, 999, 99999, -9999} : " + isVanilla(new int[] {9, 999, 99999, -9999}));
        System.out.println(" {} : " + isVanilla(new int[]{}));
    }

    static int isVanilla(int[] a){
        int ret       =1;
        int digit     =-1;
        int remainder =0;

        for (int i=0; i<a.length; i++){
            int num =a[i];

            while (num>0){
                remainder = num%10;
                if (digit ==-1) 
                    digit = remainder; 
                else{
                    if (digit != remainder) {
                        ret =0;
                        break;
                    }
                }
                num /=10;
            }

            if (ret ==0) break;
        }
        return ret;
    }

}

