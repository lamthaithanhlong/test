package saiPackage;

public class Test1810MinMaxDisjoint {
    public static void main(String[] args){
        System.out.println("{5, 4, 1, 3, 2}   : " + isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println("{18, -1, 3, 4, 0} : " + isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println("{9, 0, 5, 9}      : " + isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println("{0, 5, 18, 0, 9}  : " + isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println("{7, 7, 7, 7}      : " + isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println("{}                : " + isMinMaxDisjoint(new int[]{}));
        System.out.println("{1, 2}            : " + isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println("{1}               : " + isMinMaxDisjoint(new int[]{1}));
   }

   static int isMinMaxDisjoint(int[] a){

       if (a.length ==0) return 0;

       int min =a[0], minIdx =0;
        int max =a[0], maxIdx =0;
        int ret =1;

       // finding min and max
        for(int i=1; i<a.length; i++){
            if(min ==a[i] || max ==a[i]) {
                ret =0;
//                System.out.println("first assign : min=" + min + ", max=" + max + ", a[" +i+"]="+a[i]);
            }

           if(min >a[i]){
                min    =a[i];
                minIdx =i;
            }

           if(max <a[i]){
                max    =a[i];
                maxIdx =i;
            }
       }

       if((min == max) || (minIdx+1 == maxIdx) || (minIdx-1 == maxIdx)){
                ret =0;
//               System.out.println("second assign : min=" + min + ", max=" + max + ", minIdx="+minIdx+", maxIdx=" +maxIdx);
        }
       return ret;
    }
}