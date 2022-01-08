
package proje6;

import java.util.Scanner;

public class Proje6 {

    /* NEGATİF BİR DEĞER GİRİLENE KADAR KULLANICIDAN  GİRİŞLERİ KABUL EDİP TEK SAYILARI TOPLAYAN PROGRAM
   
     */
    public static void main(String[] args) {
      Scanner scan =new Scanner (System.in);
    int toplam=0;
    int giris;
    while(true){
        System.out.println("LÜTFEN SAYI GİRİNİZ..:");
        giris=scan.nextInt();
        
        if(giris%2==1){
            toplam+=giris;
        }
        
        if(giris<0){
            System.out.println("NEGATİF BİR DEĞER GİRDİNİZ");
            System.out.println("GİRİLEN TEK SAYILARIN TOPLAMI"+toplam);
            break;
            
           
        }
    }
      
               
            
        
    }
    
}
