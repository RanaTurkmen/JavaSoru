package javasorubankası;

public class sm12 {
    public static void main(String[] args) {
        /*
    12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını
    kontrol etmek için kod yazınız.
  Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
 ‘ali.’ için kodunuz konsolda false yazdırmalıdır
 ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
 ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
 ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
     */
        String s="Ali.";
        String bas= s.substring(0,1);
        String son= s.substring(s.length()-1);
        boolean buyukHarfMi=bas.equals(bas.toUpperCase());
        boolean nokta=son.equals(".");
        System.out.println(buyukHarfMi && nokta);

    }
}
