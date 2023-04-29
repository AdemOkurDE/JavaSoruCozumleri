package s02_ifElseStatements;

import java.util.Scanner;

public class S26_If_ElseStatements_Soru1 {

    public static void main(String[] args) {
        /*
            Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
                    Erkek 65 yas ve uzeri emekli olabilir.
                    Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
                    “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi ve cinsiyetinizi(E/K) giriniz : ");
        int yas = scanner.nextInt();
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        if(cinsiyet =='E'){

            if (yas>=65){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println((65-yas) + " yil sonra emekli olabilirsin");
            }

        }else {
            if (yas>=60){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println((60-yas) + " yil sonra emekli olabilirsin");
            }
        }

    }
}
