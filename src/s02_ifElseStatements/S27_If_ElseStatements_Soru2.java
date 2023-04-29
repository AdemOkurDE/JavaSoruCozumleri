package s02_ifElseStatements;

import java.util.Scanner;

public class S27_If_ElseStatements_Soru2 {

    public static void main(String[] args) {


        /*
            Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 /
                    (boy *boy)) vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu,
                    20-25 arasi ise normal, 20’den kucukse zayif yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilo ve boyunuzu giriniz : ");
        double kilo = scanner.nextDouble();
        double boy = scanner.nextDouble();

        double vke =(kilo*10000)/(boy*boy);
        System.out.println("Vucud kitle endeksiniz : " + vke);

        if (vke>30){
            System.out.println("Sonuc : Obez");
        }else if (vke>=25){
            System.out.println("Sonuc : Kilolu");
        } else if (vke >=20) {
            System.out.println("Sonuc : Normal");

        }else {
            System.out.println("Sonuc : Zayif");
        }


    }
}
