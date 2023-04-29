package s02_ifElseStatements;

import java.util.Scanner;

public class S31_NestedIfElseStatements_Soru3 {
    public static void main(String[] args) {

        /*
            Soru 3- Kullanicidan bir sayi alin
                    sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
                    sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi= scanner.nextInt();

        if (!(sayi%2==0)){ // tek ise:
            if (sayi<0){
                System.out.println("Negatif sayi!");
            }else {
                System.out.println("Pozitif sayi!");
            }
        }
        else { // cift ise:

            if (sayi%10==0){
                System.out.println("10 'un tam kati");
            }else {
                System.out.println("10 'un tam kati degil");
            }
        }

    }
}
