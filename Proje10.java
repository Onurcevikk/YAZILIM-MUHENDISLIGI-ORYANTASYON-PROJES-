/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proje10;

import java.util.Scanner;

/**
 *
 * @author ronur
 */
public class Proje10 {

    /* ASAL SAYI BULMA
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
          int ptbs=0;
          System.out.println("LÜTFEN BİR SAYI GİRİNİZ");
          int sayi=scan.nextInt();
          for (int i = 1; i <= sayi; i++) {
              if(sayi%i==0){
                  ptbs++;}
            
        }if(ptbs==2&&sayi>0){
            System.out.println("BU SAYI ASALDIR");
        }else{
            System.out.println("ASAL DEĞİLDİR");
        }

	}

}
    
    
    

