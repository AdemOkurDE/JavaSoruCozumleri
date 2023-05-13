package s05_methods;

import java.util.Scanner;

public class S01 {
    /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
                baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
                bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
                - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String str= scanner.nextLine();

        System.out.println("Baslangic index'i giriniz : ");
        int baslangic= scanner.nextInt();

        System.out.println("Bitis index'i giriniz : ");
        int bitis= scanner.nextInt();

        if (bitis<baslangic){
            System.err.println("Baslangic index,  bitis index'ten buyuk olamaz!");
        } else if (bitis>=str.length()) {
            System.err.println("istenen index metin boyutundan buyuk olamaz!");

        }else {
            aralikGetir(str, baslangic, bitis );
        }

    }

    private static void aralikGetir(String str, int baslangic, int bitis) {

        System.out.println(str.substring(baslangic,bitis));
    }
}
