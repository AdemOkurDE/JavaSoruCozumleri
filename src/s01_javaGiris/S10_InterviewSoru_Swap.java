package s01_javaGiris;

import java.util.Scanner;

public class S10_InterviewSoru_Swap {

    public static void main(String[] args) {

       // Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
       //        degerlerini degistirin(swap).

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz : ");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        sayi1 +=sayi2;
        sayi2 =sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("Degistirilen 1. sayi : " + sayi1);
        System.out.println("Degistirilen 2. sayi : " + sayi2);


    }

}
