package saiPackage;

public class Question57OneTwoOneArray{
    public static void main(String[] args){
        System.out.println("{1, 2, 1}                            : " + is121Array(new int[]{1, 2, 1}));
        System.out.println("{1, 1, 2, 2, 2, 1, 1}                : " + is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println("{1, 1, 2, 2, 2, 1, 1, 1}             : " + is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println("{1, 1, 1, 2, 2, 2, 1, 1}             : " + is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println("{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}       : " + is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println("{1, 1, 1, 1, 1, 1}                   : " + is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println("{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1} : " + is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println("{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}    : " + is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}));
        System.out.println("{2, 2, 2}                            : " + is121Array(new int[]{2, 2, 2}));
    }

    static int is121Array(int[] a){
        int beginningOneCount =0;
        int endingOneCount    =0;
        int twoCount          =0;
        int ret               =1;
        int i=0, j=0;
 
        if (a[0]!=1 || a[a.length-1]!=1) return 0;

        for(i=0; i<a.length; i++){
            if (a[i]==1) beginningOneCount++;
            else         break;
        }
        for(j=a.length-1; j>=0; j--){
            if (a[j]==1) endingOneCount++;
            else         break;
        }
        for(int k=i; k<=j; k++){
            if (a[k]==2) {twoCount++;}
            else         {break;}
        }
        if ( (beginningOneCount!=endingOneCount) ||
             (beginningOneCount+endingOneCount+twoCount)!=a.length) 
            ret=0;

        return ret; 

    }

}

