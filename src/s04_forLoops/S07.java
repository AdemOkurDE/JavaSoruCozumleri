package s04_forLoops;

import java.util.Scanner;

public class S07 {
    /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz : ");
        int sayi = scanner.nextInt();
        int rakamlarToplami=0;

        for (int i = sayi; i >=0 ; i--) {
            rakamlarToplami+=sayi%10;
            sayi/=10;
            if (sayi==0){
                break;
            }
        }
        System.out.println("Rakamlar toplami : " + rakamlarToplami);

    }
}
