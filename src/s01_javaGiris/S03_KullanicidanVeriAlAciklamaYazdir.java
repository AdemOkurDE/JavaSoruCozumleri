package s01_javaGiris;

import java.util.Scanner;

public class S03_KullanicidanVeriAlAciklamaYazdir {
    public static void main(String[] args) {

//        Kullanicidan uc farkli data turunde deger alip,
//        girilen degerleri aciklamalariyla
//        yazdirin.

        Scanner scanner  =new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String str=scanner.nextLine();
        System.out.println("Lutfen bir tamsayi girniz : ");
        int sayi= scanner.nextInt();
        System.out.println("Lutfen ondalikli bir sayi girniz : ");
        double ondalikliSayi=scanner.nextDouble();

        System.out.println("Girdiginiz String turu data : " + str);
        System.out.println("Girdiginiz Integer turu data : " + sayi);
        System.out.println("Girdiginiz Double turu data : " + ondalikliSayi);

    }
}
