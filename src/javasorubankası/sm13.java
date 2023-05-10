package javasorubankası;

public class sm13 {
    public static void main(String[] args) {
       /*
       13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        sembol olmalıdır.
        Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        '! a b 3 k' kodunuz konsolda false yazdırmalıdır

        */
        String sifre = "!1a23b4?es";
        boolean b1=!sifre.contains(" ");
        boolean b2=sifre.length()>8;
        boolean b3=sifre.replaceAll("[a-zA-Z0-9]","").length()>0;

        System.out.println(b1&&b2&&b3);
        


    }
}
