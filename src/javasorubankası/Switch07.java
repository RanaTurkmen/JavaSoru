package javasorubankası;

import java.util.Scanner;

public class Switch07 {
    public static void main(String[] args) {
        /*
        Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km"
yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz
"28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde, kodunuz
"Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Donusum yapmak istediginiz birimi mildenkm, saniyedenSaate, fahrenheittenSantgrata giriniz");
        String donusum = input.next();

        System.out.println();
        System.out.println("Lutfen bir sayi giriniz");
        //  double sayi = input.nextDouble();

        double mil = input.nextDouble();
        double saniye = input.nextDouble();
        double fahrenayt = input.nextDouble();

        switch (donusum) {
            case "mildenKm":
                System.out.println("Mil'i km cevirme islem sonucu: " + (mil * 1.609344));
                break;
            case "saniyedenSaate":
                System.out.println("Saniye yi saate cevirme sonucu: " + (saniye /3600));
                break;
            case "fahrenayttenSantgrata":
                System.out.println("Fahrenayt i Santgrad a cevirme sonucu: " + (fahrenayt * -17.2222222));
                break;
            default:
                System.out.println("Bu operatör o dönüştürücü için tanımlanmadı");
        }







    }
}
