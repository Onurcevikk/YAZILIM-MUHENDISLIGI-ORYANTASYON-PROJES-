package proje;

import java.util.Scanner;

public class Proje {
/* BİLET FİYATI BELİRLEYEN PROGRAM
  1-   12 YAŞINDAN KÜÇÜKSE %20 İNDİRİM
  2-   65+  %40 İNDİRİM 
  3-   HER 1 KİLOMETRE İÇİN FİYAT 50 KURUŞ*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("KAÇ KİLOMETRE YOL GİDECEKSİNİZ");
        int yol =scan.nextInt();
        double fiyat=yol*0.5;
        System.out.println("KAÇ YAŞINDASINIZ");
        int yas=scan.nextInt();
        if(yas<12){
            double biletfiyat=fiyat-(fiyat*0.2);
            System.out.println("ÖDEMENİZ GEREKEN TOPLAM TUTATR"+biletfiyat);
        }
        else if (yas>65){
            double biletfiyat=fiyat-(fiyat*0.4);
            System.out.println("ÖDEMENİZ GEREKEN TOPLAM TUTAR"+biletfiyat);
        }else{
            System.out.println("ÖDEMENİZ GEREKEN TOPLAM TUTAR"+fiyat);
        }
        
        
      
          
        
      
        
                    
            
        
       
      

            
        
    }
    
} 

