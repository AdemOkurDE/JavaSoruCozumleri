package s03_stringManipulations;

import java.util.Scanner;

public class S02_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 2 : Kullanicidan bir String ve aranacak metin alin.
                     Aranan metnin String icerisinde kullanimini kontrol ederek
                     asagidaki cumlelerden uygun olanini yazdirin.
                    - String aranan metni icermiyor
                    - Aranan metin String’de sadece 1 kere kullanilmis
                    - Aranan metin String’de 1’den fazla kullanilmis
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir metin ve aranacak kelime giriniz :");
        String metin= scanner.nextLine();
        String kelime= scanner.nextLine();

        String str=metin;// ahmet hocanin cozumu icin

        int sayac=0;

        if (metin.contains(kelime)){
            sayac++;
            metin=metin.substring(metin.indexOf(kelime)+1);

            if (metin.contains(kelime)) sayac++;
        }
        switch (sayac){
            case 0: System.out.println("String aranan metni icermiyor");break;
            case 1: System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");break;
            case 2: System.out.println("Aranan metin String’de 1’den fazla kullanilmis");break;
        }

        System.out.println("\n============= 2. cozum ===========\n");
        //Ahmet hocanin cozumu :

        if (str.indexOf(kelime)==-1){

            System.out.println("bu cümlede aradiginiz kelime yok");

        } else if (str.indexOf(kelime , ((str.indexOf(kelime))+1))==-1) {

            System.out.println("bu cümlede aradiginiz kelimeden bir tane var");

        }else System.out.println("bu cümlede aradiginiz kelimeden birden fazla var");

    }
}
