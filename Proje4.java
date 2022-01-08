
package proje4;

import java.util.Scanner;
/* VERGİ HESABI 
1-MAAŞ 3000+ İSE YÜZDE 15
2- DEĞİLSE %10
3-6000+ İSE % 21 */
public class Proje4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("AYLIK MAAŞINIZ KAÇ TL  ?");
        int maas =scan.nextInt();
        if(maas>3000&&maas<6000){
            double netmaas=maas-(maas*0.15);
            double vergi=(maas*0.15);
            System.out.println("NET MAAŞINIZ "+netmaas+"    ÖDEDİĞİNİZ VERGİ TUTAR  "+vergi);
            
        }
        else if(maas>6000){
            double netmaas=maas-(maas*0.21);
            double vergi=(maas*0.21);
            System.out.println("NET MAAŞINIZ "+netmaas+"    ÖDEDİĞİNİZ VERGİ TUTAR  "+vergi);
            
        }else{
            double netmaas=maas-(maas*0.1);
            double vergi=(maas*0.1);
            System.out.println("NET MAAŞINIZ "+netmaas+"    ÖDEDİĞİNİZ VERGİ TUTAR  "+vergi);
            
        }

    }
    
}
