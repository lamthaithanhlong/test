package saiPackage;

public class Question53computeHMS{
    public static void main(String[] args){
        int seconds = Integer.parseInt(args[0]);
        int[] a = computeHMS(seconds);

        System.out.print("HMS for " + seconds + " is : ");
        for (int i=0; i<a.length; i++){
            if (i==0) System.out.print(a[i] + " hour ");
            if (i==1) System.out.print( ", " + a[i] + " minutes and ");
            if (i==2) System.out.print( ", " + a[i] + " seconds.\n");
        }
    }

    static int[] computeHMS(int seconds){
        int s   =seconds;
        int hour=0;
        int mins=0;
        int sec =0;
        int[] hms   = new int[]{0,0,0};
        int   count =0;

        hms[0] = s/3600; // hr
            s  = s%3600;
        hms[1] = s/60; // min
        hms[2] = s%60; // sec
        
        return hms; 

    }

}
