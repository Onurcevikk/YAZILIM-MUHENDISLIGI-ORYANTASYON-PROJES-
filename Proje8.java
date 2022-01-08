/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proje8;

import java.util.Scanner;

/*
 YAKILAN KALORİ HESABI PROGRAMI 
ERKEK İÇİN ADIM UZUNLUĞU 35 
KADIN İÇİN ADIM UZUNLUĞU 25
YAKILAN KALORİ MİKTARI ADIMSAYISI*ADIMUZUNLUĞU/500
 
 */
public class Proje8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("LÜTFEN CİNSİYET GİRİNİZ..:");
        String cinsiyet=scan.nextLine();
        System.out.println("KAÇ ADIM ATTINIZ");
        int adimSayisi=scan.nextInt();
        if(cinsiyet.equals("erkek")){
            double kalori=(adimSayisi*35)/500;    
            System.out.println("YAKILAN KALORİ MİKTARI =    "+kalori);
        }else{
            double kalori=(adimSayisi*25)/500;
            System.out.println("YAKILAN KALORİ MİKTARI =    "+kalori);
        }
       
       
      

    }
    
}
