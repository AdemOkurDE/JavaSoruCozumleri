package s01_javaGiris;

import java.util.Scanner;

public class S09_InterviewSoru_Swap {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz : ");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        int sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;

        System.out.println("Degistirilen 1. sayi : " + sayi1);
        System.out.println("Degistirilen 2. sayi : " + sayi2);

    }
}
