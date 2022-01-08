/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proje9;

import java.util.Scanner;

/**
 *
 * @author ronur
 */
public class Proje9 {

    /*Bir fabrikada makinelerin çalışmaya başlama zamanları farklıdır.
    Fabrikanın çalışmaya başlama saati mevsime göre değişmektedir.
    Sonbahar ve Kış aylarında fabrika 08:00 de çalışmaya başlamaktadır.
    İlkbahar ve Yaz aylarında ise fabrikanın çalışmaya başlama saati 09:00 dır.
    Fabrikanın paydos saati her mevsim 17:00 dır.
    Makineler Sonbahar ve Kış aylarında 30 dakika ara ile İlkbahar ve Yaz aylarında ise 45 dakika ara ile çalışmaya başlatılmaktadır.
    Programa fabrikadaki makine sayısı ve hangi ayda olduğu (1 ile 12 arasında bir değer) bilgisi giriş olarak veriliyor.
    Programın çıktısı olarak makinelerin sırasıyla toplam kaç dakika çalıştığı ekrana yazdırılmaktadır.

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("LÜTFEN KAÇ MAKİNA OLDUĞUNU GİRİNİZ...:");
        byte makinaSayisi=scan.nextByte();
        System.out.println("HANGİ AYDA OLDUĞUNUZU GİRİNİZ...:");
        byte ay=scan.nextByte();
        int sure,aralık;
        if(ay>2&&ay<9){
            sure=480;
            aralık =45;
            
        }else{
            sure =540;
            aralık=30;
        }
        for (int i = makinaSayisi; i >0; i--) {
            System.out.print(sure+",");
            sure=sure-aralık;
            
        }
                

        
        

    }
    
}
