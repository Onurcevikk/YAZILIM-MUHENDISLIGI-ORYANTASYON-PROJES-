
package proje2;
import java.util.Scanner;

public class Proje2 {
// 4 İŞLEMLİ HESAP MAKİNESİ
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("TOPLAMA İÇİN 0  ÇIKARMA İÇİN 1   ÇARPMA İÇİN 2   BÖLME İÇİN 3");
        byte giris=scan.nextByte();
        while(giris>3){
            System.out.println("HATALI GİRİŞ YAPTINIZ\n"
                    + "TOPLAMA İÇİN 0  ÇIKARMA İÇİN 1   ÇARPMA İÇİN 2   BÖLME İÇİN 3");
        giris=scan.nextByte();
        }
        switch(giris){
            case(0):
                System.out.println("TOPLAMA İŞLEMİNİ SEÇTİNİZ");
                System.out.println("BİRİNCİ SAYIYI GİRİNİZ");
                int sayi1=scan.nextInt();
                System.out.println("İKİNCİ SAYIYI GİRİNİZ");
                int sayi2=scan.nextInt();
                System.out.println(sayi1+sayi2);
                break;
            case(1):
                System.out.println("ÇIKARMA İŞLEMİNİ SEÇTİNİZ");
                System.out.println("BİRİNCİ SAYIYI GİRİNİZ");
                int sayi3=scan.nextInt();
                System.out.println("İKİNCİ SAYIYI GİRİNİZ");
                int sayi4=scan.nextInt();
                if(sayi4>sayi3){
                    System.out.println(sayi4-sayi3);
                }else{
                    System.out.println(sayi3-sayi4);
                }
                break;
            case(2):
                System.out.println("ÇARPMA İŞLEMİNİ SEÇTİNİZ");
                System.out.println("BİRİNCİ SAYIYI GİRİNİZ");
                int sayi5=scan.nextInt();
                System.out.println("İKİNCİ SAYIYI GİRİNİZ");
                int sayi6=scan.nextInt();
                System.out.println(sayi5*sayi6);
                break;
            case(3):
                System.out.println("BÖLME İŞLEMİNİ SEÇTİNİZ");
                System.out.println("BİRİNCİ SAYIYI GİRİNİZ");
                int sayi7=scan.nextInt();
                System.out.println("İKİNCİ SAYIYI GİRİNİZ");
                int sayi8=scan.nextInt();
                if(sayi8==0){
                    System.out.println("TANIMSIZ");
                    break;
                }
                System.out.println(sayi7/sayi8);
        }
        
        
        
                
                
        
        
 

     

    }
    
}
