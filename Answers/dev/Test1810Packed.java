package saiPackage.dev;

public class Test1810Packed {
    public static void main(String[] args){
        System.out.println("{2, 2, 3, 3, 3}                : " + isPacked(new int[]{2, 2, 3, 3, 3}));
        System.out.println("{2, 3, 2, 3, 3}                : " + isPacked(new int[]{2, 3, 2, 3, 3}));
        System.out.println("{2, 2, 2, 3, 3, 3}             : " + isPacked(new int[]{2, 2, 2, 3, 3, 3}));
        System.out.println("{2, 2, 1}                      : " + isPacked(new int[]{2, 2, 1}));
        System.out.println("{2, 2, 1, 2, 2}                : " + isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println("{4, 4, 4, 4, 1, 2, 2, 3, 3, 3} : " + isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println("{7, 7, 7, 7, 7, 7, 7, 1}       : " + isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println("{7, 7, 7, 7, 1, 7, 7, 7}       : " + isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println("{7, 7, 7, 7, 7, 7, 7}          : " + isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println("{}                             : " + isPacked(new int[]{}));
        System.out.println("{1, 2, 1}                      : " + isPacked(new int[]{1, 2, 1}));
        System.out.println("{2, 1, 1}                      : " + isPacked(new int[]{2, 1, 1}));
        System.out.println("{-3, -3, -3}                   : " + isPacked(new int[]{-3, -3, -3}));
        System.out.println("{0, 2, 2}                      : " + isPacked(new int[]{0, 2, 2}));
        System.out.println("{2, 1, 2}                      : " + isPacked(new int[]{2, 1, 2}));
    }

   static int isPacked(int[] a){
        if (a.length ==0) return 1;

       int ret        =1;
        int num        =0;
        int count      =0;
        int totalcount =0;
       
        for(int i=0; i<a.length; i++){
            if(a[i] ==num)
                count++;
            else{
                if (num !=count) {ret =0; break;}  // if not consecutive
                else{
                    num   =a[i];
                    count =1;
                }
            }

           // total count check
            totalcount =0;
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]) totalcount++;
            }

           if (a[i] !=totalcount) {
                ret =0;
                //System.out.println("Enter totalCount");
                break;
            }
        }
       return ret;
    }
}