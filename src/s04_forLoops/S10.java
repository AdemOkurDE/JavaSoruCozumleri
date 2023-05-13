package s04_forLoops;

import java.util.Scanner;

public class S10 {
    /*
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String str = scanner.nextLine();
        String newStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            newStr+=str.substring(i,i+1);
        }
        str=newStr;
        System.out.println(str);
    }
}
