package s03_stringManipulations;

import static java.lang.Integer.parseInt;

public class S05_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                    input1 : “15.30 €” , input2 : “11.40 €”
                    output : 26.70 €
         */

        String input1 = "15.90 €";
        String input2 = "1.40 €";

        int sayi1= parseInt( (input1.replaceAll("\\D", "")));
        int sayi2= parseInt( (input2.replaceAll("\\D", "")));

        String toplam=""+ (sayi1+sayi2);
        System.out.println("output : " +toplam.substring(0,toplam.length()-2)+"."+toplam.substring(toplam.length()-2) +" €");


    }
}
