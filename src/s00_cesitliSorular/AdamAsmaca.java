package s00_cesitliSorular;

import java.util.Scanner;

public class AdamAsmaca {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//        String[] kelimeler={"java","programlama","fonksiyon","yazilan","degisken","kodlama","adana","kayseri","zonguldak","elma","armut","havuc","mandalina"};
//        int ratgeleSayi=(int)(Math.random()* kelimeler.length);
//        String kelime=kelimeler[ratgeleSayi ]; // kelimeler array den rastgele bir kelime getir

        String kelime=kelimeGetir(); //yukardaki kodu iptal edip methodddan kelime getirtiyoruz


        int hak = 6; // Toplam tahmin hakkı
        String[] harfler = new String[kelime.length()]; // Tahmin edilen harfleri tutacak dizi

        // Tahmin edilen harfleri '_' karakteri ile başlat
        for (int i = 0; i < kelime.length(); i++) {
            harfler[i] = "_";
        }

        // Oyunun ana döngüsü
        while (hak > 0) {
            // Tahmin edilen kelimeyi ekrana yazdır
            for (int i = 0; i < kelime.length(); i++) {
                System.out.print(harfler[i] + " ");
            }
            System.out.println();

            // Kullanıcıdan harf tahmini iste
            System.out.print("Bir harf tahmin edin: ");
            String tahmin = scanner.nextLine();

            // Tahmin edilen harf kelimede var mı kontrol et
            boolean bulundu = false;
            for (int i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == tahmin.charAt(0)) {
                    harfler[i] = tahmin.substring(0,1);
                    bulundu = true;
                }
            }

            // Tahmin edilen harf kelimede yoksa hak sayısını azalt
            if (!bulundu) {
                hak--;
                System.out.println("Yanlış tahmin! " + hak + " hakkınız kaldı.");
            }

            // Kazanma koşulunu kontrol et
            boolean kazandi = true;
            for (int i = 0; i < kelime.length(); i++) {
                if (harfler[i].equals("_")) {
                    kazandi = false;
                    break;
                }
            }
            if (kazandi) {
                System.out.println("Tebrikler, kelimeyi doğru tahmin ettiniz!\nKelime:"+kelime);
                break;
            }
        }

        // Kaybetme durumunda doğru kelimeyi göster
        if (hak == 0) {
            System.out.println("Tahmin hakkınız kalmadı. Doğru kelime: " + kelime);
        }

        scanner.close(); // Scanner nesnesini kapat
    }
    public static String kelimeGetir(){
        String[] kelimeler={"java","programlama","fonksiyon","yazilan","degisken","kodlama","adana","kayseri","zonguldak","elma","armut","havuc","mandalina"};
        int ratgeleSayi=(int)(Math.random()* kelimeler.length);
        String secilenKelime=kelimeler[ratgeleSayi ]; // kelimeler array den rastgele bir kelime getir

        return secilenKelime;
    }
}

