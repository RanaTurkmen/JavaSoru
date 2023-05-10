package javasorubankası;

public class sm04 {
    public static void main(String[] args) {
        /*
    4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
     */
        String str ="1a3Bcf4!...";
        int sum= str.replaceAll("[0-9]","").length();

        System.out.println(sum);




    }
}
