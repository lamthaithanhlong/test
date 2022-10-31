//This Question is same as Question13
//This Question is same as Question13
//This Question is same as Question13

package saiPackage;

public class Question47vesuvian{
    public static void main(String[] args){
        System.out.println("Is 50 a Vesuvian : " + isVesuvian(50));
        System.out.println("Is 55 a Vesuvian : " + isVesuvian(55));
        System.out.println("Is 65 a Vesuvian : " + isVesuvian(65));
        System.out.println("Is 85 a Vesuvian : " + isVesuvian(85));
        System.out.println("Is 86 a Vesuvian : " + isVesuvian(86));
    }

    static int isVesuvian(int n){
        int count =0;

        for (int i=1; i<=n/2; i++){
            for (int j=1; j<=n/2; j++){
                if(n == (i*i) + (j*j)){
                    count++;
                }
            }
        }
        if (count>1) return 1;
        else         return 0;
    }

}
//This Question is same as Question13
//This Question is same as Question13
//This Question is same as Question13
