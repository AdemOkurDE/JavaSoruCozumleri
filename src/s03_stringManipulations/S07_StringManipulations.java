package s03_stringManipulations;

import java.util.Scanner;

public class S07_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
                     kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                     eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
                    - ilk harf kucuk harf olmali
                    - son karakter rakam olmali
                    - sifre bosluk icermemeli
                    - uzunlugu en az 10 karakter olmali
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz : ");
        String sifre= scanner.nextLine();
        int sayac=0;

        if (!(sifre.charAt(0)>'a'&&sifre.charAt(0)<'z')){
            System.out.println("Ilk harf kucuk harf olmali");
            sayac++;
        }
        if (!(sifre.charAt(sifre.length()-1)>'0'&&sifre.charAt(sifre.length()-1)<'9')){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }
        if (sifre.length()<10){
            System.out.println("uzunlugu en az 10 karakter olmali");
            sayac++;
        }
        if (sayac==0){
            System.out.println("sifre basariyla kaydedildi.");
        }
    }
}
