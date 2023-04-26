package s01_javaGiris;

import java.util.Scanner;

public class S13_DataCasting_Soru3 {

    public static void main(String[] args) {

        /*
            Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
                    ile 127 arasindaki bir sayiya donusturup yazdirin.
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        System.out.println("Sayinin \" byte \" karsiligi : " + (byte) sayi );

        //Modulus ile yapimi :
        int modlusayi=sayi%256;
        if (modlusayi>127){
            modlusayi-=256;
        }
        System.out.println(modlusayi);
    }
}
