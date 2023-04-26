package s02_ifElseStatements;

import java.util.Scanner;

public class S20_If_Statements_Soru5 {
    public static void main(String[] args) {

        /*
            Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
                    kucukse “Maalesef kaldin” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");
        int sayi = scanner.nextInt();


        if (sayi>=50){
            System.out.println("Sinifi Gectin");
        }
        if (sayi<50) {
            System.out.println("Maalesef kaldin");
        }
    }
}
