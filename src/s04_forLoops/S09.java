package s04_forLoops;

import java.util.Scanner;

public class S09 {
    /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String str = scanner.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }
    }
}
