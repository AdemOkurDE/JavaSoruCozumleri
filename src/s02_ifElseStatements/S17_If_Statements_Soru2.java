package s02_ifElseStatements;

import java.util.Scanner;

public class S17_If_Statements_Soru2 {
    public static void main(String[] args) {

        /*
            Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
                    NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                    Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char harf = scanner.next().toLowerCase().charAt(0);

        if (harf=='o'){
            System.out.println("Ocak");
        }
        if (harf=='s'){
            System.out.println("Subat");
        }
        if (harf=='m'){
            System.out.println("Mart - Mayis");
        }
        if (harf=='n'){
            System.out.println("Nisan");
        }
        if (harf=='h'){
            System.out.println("Haziran");
        }
        if (harf=='t'){
            System.out.println("Temmuz");
        }
        if (harf=='a'){
            System.out.println("Agustos - Aralik");
        }
        if (harf=='e'){
            System.out.println("Eylul - Ekim");
        }
        if (harf=='k'){
            System.out.println("Kasim");
        }
    }
}
