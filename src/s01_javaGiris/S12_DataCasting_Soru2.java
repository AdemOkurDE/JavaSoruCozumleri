package s01_javaGiris;

import java.util.Scanner;

public class S12_DataCasting_Soru2 {
    public static void main(String[] args) {

        /*
            Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char harf=scanner.next().charAt(0);
        char sonrakiHarf=(char) (harf+1);
        System.out.println("Girdiginiz harften sonraki harfler : " + (char) (harf+1)+" - "+
                (char) (harf+2)+" - "+(char) (harf+3) );
    }
}
