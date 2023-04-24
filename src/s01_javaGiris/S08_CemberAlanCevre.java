package s01_javaGiris;

import java.util.Scanner;

public class S08_CemberAlanCevre {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz : ");
        double yariCap= scanner.nextDouble();

        System.out.println("Cemberin alani : " + (3.14*yariCap*yariCap));
        System.out.println("Cemberin cevresi : " + (3.14*yariCap*2));
    }
}
