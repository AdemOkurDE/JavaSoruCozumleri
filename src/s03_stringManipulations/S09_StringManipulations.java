package s03_stringManipulations;

import java.util.Scanner;

public class S09_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 6 : Kullanicidan alinan bir String alin,
                    String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
                    String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir cumle giriniz :");
        String metin= scanner.nextLine();

        if (metin.length()%2==0){
            System.out.println(metin.substring(0,metin.length()/2) +":)"+metin.substring(metin.length()/2) );
        }else {
            System.out.println(metin.substring(0,metin.length()/2) +":("+metin.substring(metin.length()/2+1) );
        }
    }
}
