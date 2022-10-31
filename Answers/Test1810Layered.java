package saiPackage;

public class Question67Layered{
    public static void main(String[] args){
        System.out.println("{1,1,2,2,2,3,3} : " + isLayered(new int[]{1,1,2,2,2,3,3}));
        System.out.println("{3,3,3,3,3,3,3} : " + isLayered(new int[]{3,3,3,3,3,3,3}));
        System.out.println("{1,2,2,2,3,3}   : " + isLayered(new int[]{1,2,2,2,3,3}));
        System.out.println("{2,2,2,3,3,1,1} : " + isLayered(new int[]{2,2,2,3,3,1,1}));
        System.out.println("{2}             : " + isLayered(new int[]{2}));
        System.out.println("{}              : " + isLayered(new int[]{}));
    }

    static int isLayered(int[] a){

        if (a.length < 2) return 0;

        int prevNum =a[0];
        int count   =1;
        int result  =1;

        for(int i=1; i<a.length; i++){
            if (a[i] == prevNum) 
                count++;
            else{
                if (count > 1 && a[i]>prevNum){
                    prevNum = a[i];
                    count =1;
                }else{
                    result =0;
                    break;
                }
            } 
        }
        return result;
    }
}

