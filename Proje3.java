
package proje.pkg3;

import java.util.Scanner;

public class Proje3 {
//sınıftaki öğrencilerin not ortalamasını hesaplayan program
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("LÜTFEN ÖĞRENCİ SAYISINI GİRİNİZ..:");
        int ogrenciSayisi =scan.nextInt();
        int toplam =0;
        int ortalama =0;
        for (int i = 1; i < ogrenciSayisi; i++) {
            System.out.println("LÜTFEN NOT GİRİNİZ..:");
            int not=scan.nextInt();
            toplam+=not;
            ortalama=toplam/i;
            
        }
        System.out.println(ortalama);

    }
    
}
