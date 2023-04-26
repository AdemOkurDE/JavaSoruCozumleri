package s01_javaGiris;

import java.util.Scanner;

public class S14_DataCasting_Soru4 {
    public static void main(String[] args) {

        /*
            Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
                    isleminin sonucununun tamsayi kismini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki double sayi giriniz : ");
        double dbSayi1 = scanner.nextInt();
        double dbSayi2 = scanner.nextInt();

        System.out.println("Double bolme sonucu : "+ dbSayi1/dbSayi2 );

        System.out.println("Tamsayi  : "+(int) (dbSayi1/dbSayi2));

    }
}
