package saiPackage;



public class Test1810MinDistance {
    public static void main(String[] args){
        System.out.print("Factors of 13013 are {1"); minDistance(13013);
        System.out.print("Factors of     8 are {1"); minDistance(    8);
    }



   static void minDistance(int n){
        int[] tmp     = new int[n/2];
        int[] factors;
        int   idx     =1;
        int   minDist =0;



       tmp[0] =1;
        for(int i=2; i<=n/2; i++){
            if (n%i ==0) {
                tmp[idx++] =i;
                System.out.print(", " + i);
            }
        }
        tmp[idx++] =n;
        System.out.print(", " + n + "} and minDistance is : ");



       for(int i=0; i<idx-1; i++){
            int diff = tmp[i+1] - tmp[i];
            if (minDist ==0 || diff <minDist) minDist = diff;
        }
        System.out.print(minDist + "\n");
    }



}
