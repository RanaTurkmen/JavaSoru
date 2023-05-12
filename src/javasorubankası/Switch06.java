package javasorubankası;

import java.util.Scanner;

public class Switch06 {
    public static void main(String[] args) {

        /*
        Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
yapan basit bir hesap makinesi oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi girin");
        double sayi1= input.nextInt();
        double sayi2= input.nextInt();
        System.out.println("Yapmak istediğiniz ilemi seçin . +, -, *, /");
        String islem = input.next();

        switch (islem){
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Geçersiz İşlem");
        }















    }
}
