package s01_javaGiris;

import java.util.Scanner;

public class S07_KullaniciAdSoyadYasFormat {
    public static void main(String[] args) {

        /*
               Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
                        girilen bilgiler : J Doe, 44
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim = scanner.next().toUpperCase().substring(0,1);

        System.out.println("Lutfen soyisminizi giriniz : ");
        String soyisim = scanner.next();


        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.toLowerCase().substring(1);
        System.out.println(isim+" "+soyisim+", "+yas);


    }
}
