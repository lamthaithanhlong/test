package saiPackage;

public class Test1810CubePerfect {
    public static void main(String[] args){
        System.out.println("{1, 1, 1, 1}   : " + isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println("{64}           : " + isCubePerfect(new int[]{64}));
        System.out.println("{63}           : " + isCubePerfect(new int[]{63}));
        System.out.println("{-1, 0, 1}     : " + isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println("{}             : " + isCubePerfect(new int[]{}));
        System.out.println("{3, 7, 21, 36} : " + isCubePerfect(new int[]{3, 7, 21, 36}));
    }

   static int isCubePerfect(int[] a){
        int ret =1;

       for(int i=0; i<a.length; i++){
            int num    =0;
            int result =0;

           ret =0;
            while(Math.abs(result) <=Math.abs(a[i])){
                if(a[i]<0){
                    result = (-1)*num*(-1)*num*(-1)*num;
                }
                else{
                    result = num*num*num;
                }

               if (result ==a[i]) ret=1;

               num++;
            }

           if (ret ==0) break;
        }
       return ret;
    }
}