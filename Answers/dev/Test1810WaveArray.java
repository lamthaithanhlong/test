package saiPackage.dev;



public class Test1810WaveArray {
    public static void main(String[] args){
        System.out.println("Is {7, 2, 9, 10, 5}  Wave Array : " + isWave(new int[]{7, 2, 9, 10, 5}));
        System.out.println("Is {4, 11, 12, 1, 6} Wave Array : " + isWave(new int[]{4, 11, 12, 1, 6}));
        System.out.println("Is {1, 0, 5}         Wave Array : " + isWave(new int[]{1, 0, 5}));
        System.out.println("Is {2}               Wave Array : " + isWave(new int[]{2}));
        System.out.println("Is {2, 6, 3, 4}      Wave Array : " + isWave(new int[]{2, 6, 3, 4}));
    }



   static int isWave(int[] a){
        int next =-1;  // 0:even, 1:odd
        int curr =-1;
        int ret  =1;



       for(int i=0; i<a.length-1; i++){
            if     (a[i]   ==0) curr =-1;
            else if(a[i]%2 ==0) curr =0;  //even
            else if(a[i]%2 !=0) curr =1;  //odd



           if     (a[i+1]   ==0) next =-1;
            else if(a[i+1]%2 ==0) next =0;  //even
            else if(a[i+1]%2 !=0) next =1;  //odd



           if (curr ==next) { ret =0; break; }
        }
        return ret;
    }
}
