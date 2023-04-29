package s03_stringManipulations;

import java.util.Scanner;

public class S03_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 1 : Kullanicidan bir String ve aranacak metin alin.
                     String’in aranan metni icerip icermedigini
                     lastIndexOf( ) method’u kullanarak yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir metin ve aranacak kelime giriniz :");
        String metin= scanner.nextLine();
        String kelime= scanner.nextLine();

        if (metin.lastIndexOf(kelime)>0){
            System.out.println("Aranan kelime metinde var");
        }else {
            System.out.println("Aranan kelime metinde yok");
        }

    }
}
