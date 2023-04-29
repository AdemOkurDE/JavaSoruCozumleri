package s02_ifElseStatements;

import java.util.Scanner;

public class S35_TernaryOperator_Soru3 {
    public static void main(String[] args) {
        /*
            Soru 3- Kullanicidan bir harf isteyin,
                    girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
                    yoksa girilen harfi yazdirin  (Ternary ile)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char harf = scanner.next().charAt(0);
        System.out.println( (harf>='A' && harf<='Z') ? harf  : (  (char) (harf-32)  )   );

    }
}
