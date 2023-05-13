package s04_forLoops;

import java.util.Scanner;

public class S04 {
    /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
                dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
                baslangic degerinden kucuk olsa da program calissin
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri giriniz : ");
        int baslangic= scanner.nextInt();
        System.out.println("Lutfen bitis degeri giriniz : ");
        int bitis= scanner.nextInt();
        int toplam=0;
        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;
            }
        }else {
            for (int i = baslangic; i >=bitis ; i--) {
                toplam+=i;
            }
        }
        System.out.println("Araliktaki sayilarin toplami : " + toplam);
    }
}
