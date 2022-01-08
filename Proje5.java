
package proje5;

import java.util.Scanner;

public class Proje5 {

    public static void main(String[] args) {
Scanner scan=new Scanner (System.in);
        System.out.println("KAÇ FAKTORİYEL OLDUĞUNU GİRİNİZ");
        int fakt=scan.nextInt();
        int toplam=1;
        for (int i = 0; i < fakt; i++) {
            toplam*=fakt-i;
            
        }
        System.out.println(toplam);
    }
    
}
