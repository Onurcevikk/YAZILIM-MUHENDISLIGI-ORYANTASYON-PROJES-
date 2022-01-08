/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proje7;

import java.util.Scanner;

/* GİRİLEN KELİMEYE SÜREKLİ BİR HARF EKLEYEREK ALT ALTA YAZDIRMA 
 */
public class Proje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("LÜTFEN BİR KELİME GİRİNİZ");
        String kelime =scan.nextLine();
        for (int i = 0; i <= kelime.length(); i++) {
            System.out.println(kelime.substring(0, i));
            
        }
        
   
        }
    }
    

    
    

