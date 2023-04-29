package s02_ifElseStatements;

import java.util.Scanner;

public class S38_TernaryOperator_Soru6 {
    public static void main(String[] args) {
        /*
            Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();


        System.out.println(sayi<0 ? sayi*-1 : sayi );
    }
}
