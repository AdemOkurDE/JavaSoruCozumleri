package buddy01;

import java.util.ArrayList;
import java.util.Scanner;

public class Child extends Parent{


    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Parent obj01= new Child();
        System.out.println(obj01.isim);

        //kullanicidanBilgi();
        obj01.isim=scanner.nextLine();


        System.out.println(obj01.isim);


    }

    static void kullanicidanBilgi(){

        System.out.println("isim giriniz");
        String isim = scanner.nextLine();
        System.out.println("soyisim giriniz");
        String soyIsim = scanner.nextLine();
        System.out.println("telefon giriniz");
        String telefon = scanner.nextLine();
        System.out.println("yas giriniz");
        int yas = scanner.nextInt();
        System.out.println("maas giriniz");
        double maas = scanner.nextDouble();

    }


}
