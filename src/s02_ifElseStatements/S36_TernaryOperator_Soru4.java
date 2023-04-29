package s02_ifElseStatements;

import java.util.Scanner;

public class S36_TernaryOperator_Soru4 {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
                    50’den kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println(sayi>=50? "Sinifi Gectin" : "Maalesef kaldin");
    }
}
