package s02_ifElseStatements;

import java.util.Scanner;

public class S16_If_Statements_Soru1 {
    public static void main(String[] args) {

        /*
            Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
                    “Sayi 5’in tam kati” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati");
        }
    }
}
