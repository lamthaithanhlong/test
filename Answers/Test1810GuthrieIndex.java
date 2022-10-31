package saiPackage;

public class Test1810GuthrieIndex {
    public static void main(String[] args){
        System.out.println(" 1 : " + guthrieIndex(1));
        System.out.println(" 2 : " + guthrieIndex(2));
        System.out.println(" 3 : " + guthrieIndex(3));
        System.out.println(" 4 : " + guthrieIndex(4));
        System.out.println(" 7 : " + guthrieIndex(7));
        System.out.println("42 : " + guthrieIndex(42));
    }

    static int guthrieIndex(int n){
        if (n<1) return 0;
        
        int count =0;
        int num   =n;
       
//        System.out.print("    " + num + " : " );
        while (num!=1){
            if (num%2 ==0){
                num /=2;
            }
            else{
                num = (num*3)+1;
            }
 //           System.out.print(num + ", ");
            count++;
        } 

//        System.out.print("\n");
        return count;


    }

}
