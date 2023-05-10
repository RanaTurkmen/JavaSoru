package javasorubankası;

public class sm09 {
    public static void main(String[] args) {
        /*
9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
karakterleri büyük harflerle yazdırınız.
Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
 */
        String str ="Java";
        System.out.println(str.substring(1, str.length() - 1).toUpperCase());



    }
}
