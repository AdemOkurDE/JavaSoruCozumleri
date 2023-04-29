package s03_stringManipulations;

import java.util.Scanner;

public class S01_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 1 : Kullanicidan bir String ve aranacak metin alin.
                     String’in aranan metni icerip icermedigini indexOf( ) method’u kullanarak yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir metin ve aranacak kelime giriniz :");
        String metin= scanner.nextLine();
        String kelime= scanner.nextLine();

        int index=metin.indexOf(kelime);

        if (index>0){
            System.out.println("Aranan kelime metinde vardir");
        }else {
            System.out.println("Aranan kelime metinde yoktur");
        }

    }
}
