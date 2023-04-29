package s02_ifElseStatements;

import java.util.Scanner;

public class S37_TernaryOperator_Soru5 {
    public static void main(String[] args) {
        /*
            Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz : ");
        int sayi1 = scanner.nextInt();
        int sayi2= scanner.nextInt();

        System.out.println(sayi1>=sayi2 ? sayi2 : sayi1);

        //Ternary disinda Kisayol :)
        System.out.println(Math.min(sayi1, sayi2));

    }
}
