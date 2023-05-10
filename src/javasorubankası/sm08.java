package javasorubankası;

public class sm08 {
    public static void main(String[] args) {
     /*
    8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
büyük harfle yazdırınız.
Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
     */

        String str="Java";
        System.out.println(str.substring(0, str.length() - 1).toUpperCase());


    }
}
