package s05_methods;

import java.util.Scanner;

public class S04 {
    /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
                bolenleri sayisini bulup bize donduren bir method olusturun.
     */

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz : ");
        int sayi= scanner.nextInt();

        System.out.println("Bolen sayisi : "+bolenSayisi(sayi));


    }
    public static int bolenSayisi(int sayi){
        int bolenSayisi=0;
        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                bolenSayisi++;
            }

        }



        return bolenSayisi;
    }
}
