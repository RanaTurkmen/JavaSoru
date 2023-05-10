package javasorubankası;

public class if04 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
         */

        int sayi = 34;
        if (sayi%10==5 || sayi%10>=5 ) {
            sayi = sayi+1;

        } else {
            sayi = sayi-1;

        }System.out.println(sayi);



    }
}
