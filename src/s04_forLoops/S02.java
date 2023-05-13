package s04_forLoops;

import java.util.Scanner;

public class S02 {
    /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
                dahil) 7 ila bolunebilen sayilari yazdirin.
     */
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz : ");
        int sayi= scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0){
                System.out.println(i);
            }
        }
    }
}
