package saiPackage.dev;

public class Test1810PerfectNumberHenery {
    public static void main(String[] args){
        System.out.println("Henery (1,3) : " + henry(1,3) + "\n");
        System.out.println("Henery (2,4) : " + henry(2,4) + "\n");
    }

    static int henry(int i, int j){
        int count =0;
        int num   =1;
        int ret   =0;

        while(count < j){
           if (isPerfectNumber(num)==1) {
               count++;
               if (count ==i || count ==j) ret +=num;
               System.out.println ("Perfect Number " + count + " is : " + num);
           }
           num++;
        }
        return ret;
    }

    static int isPerfectNumber(int n){
        int num =0;

        for (int i=1; i<=n/2; i++)
            if (n%i ==0) num += i;

        if (num==n) return 1;
        else        return 0;
    }

     

}
