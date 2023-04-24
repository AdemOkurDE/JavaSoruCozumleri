package s01_javaGiris;

import java.util.Scanner;

public class S05_KullanicidanVeriAlFormattaYazdir {
    public static void main(String[] args) {

        /*
            Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
                Isminiz : John
                Soyisminiz : Doe
                Yasiniz : 44
                Kaydiniz basariyla tamamlanmistir.
        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz : ");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        System.out.println("\tIsminiz \t: "+isim+"\n\tSoyisminiz \t: "
                + soyisim+"\n\tYasiniz \t: "+yas+"\n\tKaydiniz basariyla tamamlanmistir.");


    }
}
