package s01_javaGiris;

import java.util.Scanner;

public class S04_KullanicidanSayiAlCarp {
    public static void main(String[] args) {


//        Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
//        yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir double(ondalikli) sayi giriniz : ");
        Double db =scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz : ");
        int sayi= scanner.nextInt();

        double toplam=db+sayi;
        double carpim=db*sayi;

        System.out.println("Giriginiz sayilarin toplami : " + toplam);
        System.out.println("Giriginiz sayilarin carpimi : " + carpim);


    }
}

