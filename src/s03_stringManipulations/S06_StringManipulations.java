package s03_stringManipulations;

import java.util.Scanner;

public class S06_StringManipulations {
    public static void main(String[] args) {
        /*
            Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                    sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                    input : java1 ogRe2@nMek3 #ne +Gu=zel
                    output : Java ogrenmek ne guzel.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String str=scanner.nextLine();
        str=str.replaceAll("\\d","");
        str=str.replaceAll("\\W","");
        str=str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(str);
    }
}
