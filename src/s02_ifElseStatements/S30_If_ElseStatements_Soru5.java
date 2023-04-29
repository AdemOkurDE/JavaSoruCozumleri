package s02_ifElseStatements;

import java.util.Scanner;

public class S30_If_ElseStatements_Soru5 {
    public static void main(String[] args) {

        /*
            Soru ) Interview Question
                    Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
                    Kural 1: 4 ile bolunemeyen yillar artik yil degildir
                    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
                    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece
                    400’un kati olan yillar artik yildir
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kontrol edilecek yili giriniz : ");
        int yil = scanner.nextInt();

        if (yil%4==0){
            if (yil%100==0){
                if (yil%400==0){

                    System.out.println("Artik Yil");
                }else {
                    System.out.println("Artik Yil degildir");
                }
            }else {
                System.out.println("Artik Yil");
            }

        }
        else{
            System.out.println("Artik Yil degildir");
        }
    }
}
