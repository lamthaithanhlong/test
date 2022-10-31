package saiPackage;

public class Question59IsSquare{
    public static void main(String[] args){
        System.out.println(" 4 is square : " + isSquare(4));
        System.out.println("25 is square : " + isSquare(25));
        System.out.println("-4 is square : " + isSquare(-4));
        System.out.println(" 8 is square : " + isSquare(8));
        System.out.println(" 0 is square : " + isSquare(0));

    }
    static int isSquare(int n){
        int square =0;
        int ret    =0;

//        if (n<0) return ret;

        for (int i=0; i<=n/2 && square <=n; i++){
            square = i*i;
            if (square ==n) ret=1;
        }
        return ret;
    } 

}
