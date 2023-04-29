package s02_ifElseStatements;

import java.util.Scanner;

public class S40_SwitchStatements_Soru2 {
    public static void main(String[] args) {
        /*
            Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        int birlerBasamak=sayi%10;
        sayi/=10;
        int onlarBasamak=sayi%10;

        switch (onlarBasamak) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kirk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }

        switch (birlerBasamak) {
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println(" Bir");
                break;
            case 2:
                System.out.println(" Iki");
                break;
            case 3:
                System.out.println(" Uc");
                break;
            case 4:
                System.out.println(" Dort");
                break;
            case 5:
                System.out.println(" Bes");
                break;
            case 6:
                System.out.println(" Alti");
                break;
            case 7:
                System.out.println(" Yedi");
                break;
            case 8:
                System.out.println(" Sekiz");
                break;
            case 9:
                System.out.println(" Dokuz");
                break;
        }
    }
}
