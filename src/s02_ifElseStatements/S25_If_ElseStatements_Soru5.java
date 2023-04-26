package s02_ifElseStatements;

import java.util.Scanner;

public class S25_If_ElseStatements_Soru5 {
    public static void main(String[] args) {

        /*
            Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
                    olarak yazdirin, yoksa girilen harfi yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz : ");
        char karakter = scanner.next().charAt(0);
        if (karakter>='A' && karakter<='Z'){
            System.out.println(karakter);
        }else {
            System.out.println((char) (karakter-32));
        }
    }
}
