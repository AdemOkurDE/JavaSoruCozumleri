package s02_ifElseStatements;

import java.util.Scanner;

public class S29_If_ElseStatements_Soru4 {
    public static void main(String[] args) {

        /*
            Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
            istedigi birim metre veya santimetre ise cevirip yazdirin,
            yoksa “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km olarak giriniz : ");
        double mesafe = scanner.nextDouble();

        System.out.println("Lutfen cevirmek istediginiz birimi girini(m:metre, c:santimetre) : ");
        char birim = scanner.next().toLowerCase().charAt(0);

        if (birim=='m'||birim=='c'){

            if (birim=='m'){
                System.out.println("Metre olarak mesafe : " + (mesafe*1000));
            }else {
                System.out.println("Santimetre olarak mesafe : " + (mesafe*100000));
            }

        }
        else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }

    }
}
