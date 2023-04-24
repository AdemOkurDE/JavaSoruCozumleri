package s01_javaGiris;

import java.util.Scanner;

public class S06_DikdortgenAlani {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini ve cevresini
                    yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini(mt olarak) giriniz : ");
        int kenar1= scanner.nextInt();
        int kenar2= scanner.nextInt();

        System.out.println("Dikdortgenin alani : " + (kenar1*kenar2) + " m²");
        System.out.println("Dikdortgenin cevresi : " + (2*(kenar1+kenar2)) + " metre");
    }
}
