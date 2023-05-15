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
       /* int max=0,temp=0,bolen=0;
        for (int i = 1; i <=sayi ; i++) {

                    temp=bolenSayisi(i);

                    if (temp>bolen){
                        bolen=temp;
                        max=i;
                    }
        }
        System.out.println(max);
        System.out.println("Bolen sayisi : "+bolenSayisi(max));
*/
    }
    public static int bolenSayisi(int sayi){
        int bolenSayisi=0;
        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                //System.out.print(i+" "); // bolenlerini yazdirmak istersek
                bolenSayisi++;
            }
        }

        return bolenSayisi;
    }
}
