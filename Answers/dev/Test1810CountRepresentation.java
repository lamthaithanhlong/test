package saiPackage.dev;

public class Test1810CountRepresentation {
    public static void main(String[] args){
        System.out.println ("Rupee notes representation 10 is : " + countRepresentations(10));
        System.out.println ("Rupee notes representation 12 is : " + countRepresentations(12));
        System.out.println ("Rupee notes representation 15 is : " + countRepresentations(15));

    }

    static int countRepresentations(int numRupees){
        int total =0;
        int count =0;

        for (int rupee20=0; rupee20<=numRupees/20; rupee20++)
            for (int rupee10=0; rupee10<=numRupees/10; rupee10++)
                for (int rupee5=0; rupee5<=numRupees/5; rupee5++)
                    for (int rupee2=0; rupee2<=numRupees/2; rupee2++)
                        for (int rupee1=0; rupee1<=numRupees; rupee1++) {
                            total =0;
                            total = total + (rupee1*1) + (rupee2*2) + (rupee5*5) + (rupee10*10) + (rupee20*20);

                            //System.out.println ("RP20 : "+rupee20+ " / RP10 : " +rupee10+ " / RP05 : " +rupee5+ " / RP02 : " +rupee2+ " / RP01 : " +rupee1+ " / Total : " + total);

                            if (total == numRupees) {
                                count++;
                                break;
                            }
                            else if (total > numRupees){break;}
                        } // end of rupee1 FOR
        return count;
    }
}
