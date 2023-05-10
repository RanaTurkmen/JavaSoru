package javasorubankası;

public class sm05 {
    public static void main(String[] args) {
        /*
    5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
karakteri yazdırınız.
Örnek:'Ali Can' için n yazdırmalısınız.
 ‘Miami’ için i yazdırmalısınız.
     */

        String str="‘Miami’";
        System.out.println(str.replaceAll(" ", "").substring(str.length()-1));


    }
}
