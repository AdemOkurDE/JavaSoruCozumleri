package s03_stringManipulations;

import java.util.Scanner;

public class S08_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                    - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
                    - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir isim ve soyisim giriniz :");
        String isim= scanner.nextLine();
        String soyisim= scanner.nextLine();

        if (isim.length()>soyisim.length()){

            System.out.println("   Isim : "+
                    isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
                    +"\nSoyisim : "
                    +soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());
        }else {
            System.out.println("   Isim : "+
                    isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
                    +"\nSoyisim : "
                    +soyisim.toUpperCase());
        }




    }
}
