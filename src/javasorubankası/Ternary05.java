package javasorubankası;

public class Ternary05 {
    public static void main(String[] args) {
        /*
        Nested Ternary kullanarak;
Şifreyi kontrol etmek için kodu yazınız.
8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
         */


         String sifre= "iurkmen41";
         boolean dogruMu= sifre.length()>=8 ? sifre.substring(0,1).equals("i") :sifre.substring(0,1).equals("K") ;
        System.out.println(dogruMu);

    }
}
