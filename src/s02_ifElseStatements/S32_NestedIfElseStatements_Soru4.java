package s02_ifElseStatements;

import java.util.Scanner;

public class S32_NestedIfElseStatements_Soru4 {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan gunu ismini girmesini isteyin,
                    girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
                    seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
                    girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen gunun ismini seciniz:\n(1-Pazartesi,2-Sali,3-Carsamba,4-Persembe,5-Cuma,6-Cumartesi,7-Pazar)");
        byte gun= scanner.nextByte();

        if (gun<6){
            System.out.println("Simdi calisma zamani tatile "+(6-gun) +" gun var");
        }else {
            System.out.println("Simdi dinlenme zamani");
        }

            // 2.cozum = gun ismi girilirse :
        System.out.println("\n================ 2. COZUM : =================\n");
        System.out.println("Lutfen gun ismini giriniz : ");
        String gunIsmi= scanner.next().toLowerCase();

        if (gunIsmi.equals("pazartesi")){
            System.out.println("Simdi calisma zamani tatile 5 gun var");
        } else if (gunIsmi.equals("sali")){
            System.out.println("Simdi calisma zamani tatile 4 gun var");
        } else if (gunIsmi.equals("carsamba")){
            System.out.println("Simdi calisma zamani tatile 3 gun var");
        } else if (gunIsmi.equals("persembe")){
            System.out.println("Simdi calisma zamani tatile 2 gun var");
        } else if (gunIsmi.equals("cuma")){
            System.out.println("Simdi calisma zamani tatile 1 gun var");
        } else if (gunIsmi.equals("cumartesi")){
            System.out.println("Simdi dinlenme zamani");
        }else {
            System.out.println("Simdi dinlenme zamani");
        }


    }
}
