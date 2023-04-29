package s02_ifElseStatements;

import java.util.Scanner;

public class S43_SwitchStatements_Soru5 {
    public static void main(String[] args) {
        /*
            Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz : ");
        int sayi = scanner.nextInt();

        switch (sayi) {
            case 1:case 2:case 3:case 4:case 5:
                System.out.println("Hafta ici");
                break;
            case 6:case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecersiz giris!");
        }
    }
}
