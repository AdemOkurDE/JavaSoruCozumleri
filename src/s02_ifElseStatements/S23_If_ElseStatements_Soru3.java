package s02_ifElseStatements;

import java.util.Scanner;

public class S23_If_ElseStatements_Soru3 {
    public static void main(String[] args) {

        /*
            Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
                    yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int sayi = scanner.nextInt();
        if (sayi>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println((65-sayi) + " yil sonra emekli olabilirsin");
        }
    }
}
