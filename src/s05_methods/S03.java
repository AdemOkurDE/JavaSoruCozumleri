package s05_methods;

import java.util.Scanner;

public class S03 {
    /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
                olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
                sonuclarini donduren bir method olusturun.
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println(asalMi(sayi));
    }

    public static String asalMi(int sayi){
        int bolenSayisi=0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                bolenSayisi++;
            }
        }
        String asalMi=bolenSayisi>2?"Asal sayi degil":"Asal sayi";

        return asalMi;
    }
}
