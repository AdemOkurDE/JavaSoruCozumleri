package s02_ifElseStatements;

import java.util.Scanner;

public class S19_If_Statements_Soru4 {
    public static void main(String[] args) {

        /*
            Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
                    “Eskenar ucgen” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz : ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

        if (sayi1==sayi2 && sayi2==sayi3){
            System.out.println("Eskenar ucgen");
        }
    }
}
