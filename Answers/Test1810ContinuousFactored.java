package saiPackage;

public class Test1810ContinuousFactored {
    public static void main(String[] args){
        System.out.println("Is  06 continuous factored : " + isContinuousFactored(6));
        System.out.println("Is  60 continuous factored : " + isContinuousFactored(60));
        System.out.println("Is 120 continuous factored : " + isContinuousFactored(120));
        System.out.println("Is  90 continuous factored : " + isContinuousFactored(90));
        System.out.println("Is  99 continuous factored : " + isContinuousFactored(99));
        System.out.println("Is 121 continuous factored : " + isContinuousFactored(121));
        System.out.println("Is  02 continuous factored : " + isContinuousFactored(2));
        System.out.println("Is  13 continuous factored : " + isContinuousFactored(13));

    }

    static int isContinuousFactored(int n){
        int   ret   =0;
        int[] a     =new int[n/2];
        int   idx   =0;
        int   product =1;

        for(int i=2; i<=n/2; i++){
            if (n%i ==0){
                if (idx ==0) System.out.print("\n{" + i);
                else         System.out.print(", " + i); 

                a[idx++] =i;
            }
        }
        System.out.print("}\n");
        for(int i=0; i<idx-1; i++){
            for (int j=i; j<=idx-1; j++){
                int diff =a[j+1] -a[j];

                if (diff    ==1) {
                    if (product ==1) 
                        product = a[j] * a[j+1];
                    else product *=a[j+1]; 
                }
                else             product  =1;

                if (product ==n) {ret = 1; break;}
            }
            if (ret ==1) {break;}
         
        }
        return ret;
    }
}
