package s04_forLoops;

import java.util.Scanner;

public class S11 {
    /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
                 kontrol edin ve sonucu yazdirin.
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz : ");
        int sayi = scanner.nextInt();
        int bolenSayisi=0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                bolenSayisi++;
            }
        }
        System.out.println(sayi+ (bolenSayisi>2?" sayisi Asal degildir":" sayisi Asal sayidir"));
    }
}
