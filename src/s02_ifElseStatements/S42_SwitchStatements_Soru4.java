package s02_ifElseStatements;

import java.util.Scanner;

public class S42_SwitchStatements_Soru4 {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan ISTQB kisaltmasindan hangi harfin anlamini ogrenmek istedigini alin
                    ve girilen harfin karsiligini yazdirin.
                    I : International S : Software T : Testing Q : Qualifications B: Board
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("ISTQB kisaltmasindan hangi harfin anlamini ogrenmek istersiniz : ");
        char harf=scanner.next().toUpperCase().charAt(0);

        switch (harf){
            case 'I':
                System.out.println("International");break;
            case 'S':
                System.out.println("Software");break;
            case 'T':
                System.out.println("Testing");break;
            case 'Q':
                System.out.println("Qualifications");break;
            case 'B':
                System.out.println("Board");break;
            default:
                System.out.println("Gecersiz harf!");
        }
    }
}
