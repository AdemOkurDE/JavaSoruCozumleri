package s02_ifElseStatements;

import java.util.Scanner;

public class S28_If_ElseStatements_Soru3 {
    public static void main(String[] args) {

        /*
            Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
                    kullaniciya musteri karti olup olmadigini sorun.
                    Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
                    Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedini ve liste fiyatini giriniz : ");
        int urunAdedi = scanner.nextInt();
        double listeFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi? (E:Evet / H:Hayir) : ");
        char kartVarMi=scanner.next().toUpperCase().charAt(0);

        if (kartVarMi=='E'){
            if (urunAdedi>10){
                System.out.println("Odenecek Tutar : " + (listeFiyati*80/100));
            }else {
                System.out.println("Odenecek Tutar : " + (listeFiyati*85/100));
            }

        }
        else {
            if (urunAdedi>10){
                System.out.println("Odenecek Tutar : " + (listeFiyati*85/100));
            }else {
                System.out.println("Odenecek Tutar : " + (listeFiyati*90/100));
            }


        }




    }
}
