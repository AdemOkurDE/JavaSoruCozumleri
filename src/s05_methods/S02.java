package s05_methods;

import java.util.Scanner;

public class S02 {
    /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
                Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
                isim bosluk soyisim seklinde bize donduren bir method olusturun
                input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
     */
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim= scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz : ");
        String soyisim= scanner.nextLine();

        System.out.println(isimDuzelt(isim, soyisim));
    }

    private static String isimDuzelt(String isim, String soyisim) {
        String duzenli="";

        isim=isim.toUpperCase().substring(0,1)+isim.toLowerCase().substring(1);
        soyisim=soyisim.toUpperCase().substring(0,1)+soyisim.toLowerCase().substring(1);
        duzenli=isim + " " + soyisim;
        return duzenli;
    }
}
