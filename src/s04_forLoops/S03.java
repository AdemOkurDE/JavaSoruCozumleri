package s04_forLoops;

import java.util.Scanner;

public class S03 {
    /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
                dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
                baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri giriniz : ");
        int baslangic= scanner.nextInt();
        System.out.println("Lutfen bitis degeri giriniz : ");
        int bitis= scanner.nextInt();
        int toplam=0;

        if (bitis<baslangic){
            System.err.println("Hatali Giris!");
        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;
            }
        }
        System.out.println("Araliktaki sayilarin toplami : " + toplam);
    }
}
