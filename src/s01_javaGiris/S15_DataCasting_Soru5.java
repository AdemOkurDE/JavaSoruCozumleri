package s01_javaGiris;

import java.util.Scanner;

public class S15_DataCasting_Soru5 {
    public static void main(String[] args) {

        /*
            Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
                    ve bolum isleminin sonucununun tamsayi kismini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli (double) ve bir tamsayi giriniz : ");
        double sayi1 = scanner.nextDouble();
        int sayi2 = scanner.nextInt();

        System.out.println("Bolme isleminin tamsayi kismi : " + (int)(sayi1/sayi2));
    }
}
