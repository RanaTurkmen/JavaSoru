package javasorubankası;

public class if06 {
    public static void main(String[] args) {
        /*
       Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
yazmalıdır.
e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
yazmalıdır.
Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
"Geçersiz Ad"
         */

        String str = "Ali";
        String adIlk = str.substring(0, 1);
        Integer boslukIndex = str.trim().indexOf(" ");
        String soyAdIlk = str.substring(str.indexOf(" ") + 1, str.indexOf(" ") + 2);
        boolean ilkHarBuyuk = adIlk.charAt(0) >= 'A' && adIlk.charAt(0) <= 'Z';
        boolean soyAdBuyuk = soyAdIlk.charAt(0) >= 'A' && adIlk.charAt(0) <= 'Z';
        System.out.println(ilkHarBuyuk);
        System.out.println(soyAdBuyuk);
        if (boslukIndex == -1) {
            System.out.println("Ad veya soyadı eksik");
        }
        if (!soyAdBuyuk || !ilkHarBuyuk) {
            System.out.println("Baş harflerinde hata");
        }

        if (str.equals(str.toUpperCase())) {
            System.out.println("Format hatası");
        }

        if (str.replaceAll("\\s", "").length() == 0) {
            System.out.println("İsim girilmeli");
        }
        if (str.replaceAll("\\s", "").replaceAll("[a-zA-Z]", "").length() > 0) {
            System.out.println("Geçersiz Ad");
        }





    }
}
