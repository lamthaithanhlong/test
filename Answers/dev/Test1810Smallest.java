package saiPackage.dev;

public class Test1810Smallest {
    public static void main(String[] args){
        System.out.println("First "+args[0]+" multiples which contains two : " + smallest(Integer.parseInt(args[0])));
//        System.out.println("First 4 multiples which contains two : " + smallest(4));
//        System.out.println("First 5 multiples which contains two : " + smallest(5));
//        System.out.println("First 6 multiples which contains two : " + smallest(6));
//        System.out.println("First 7 multiples which contains two : " + smallest(7));
    }

   static int smallest(int n){
        int count =0;
        int num   =1;
        int result=0;

       int tmpResult=0;
        int remainder=0;
        boolean found=false;

       while (count<n){
            num++;
            result =1;
            count  =0;

           for(int i=1; i<=n; i++){
                result    = num*i;
                tmpResult = result;
                found     = false;
                while (tmpResult!=0){
                    remainder = tmpResult%10;
                    tmpResult = tmpResult/10;

                   if (remainder ==2) {
                        //count++;
                        found = true;
//                        System.out.println("count:"+count+", num="+num+", result="+result+", remainder:"+remainder);
                    }
                }

               if (found) count++;
            }
        }
       return num;
    }
}