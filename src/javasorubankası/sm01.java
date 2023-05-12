package javasorubankası;

public class sm01 {
    public static void main(String[] args) {

        /* 1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
    ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
    yazdırınız.*/

        String sehir = "Kocaeli";
        sehir= sehir.substring(0,1).toUpperCase()+ sehir.substring(1).toLowerCase();
        System.out.println(sehir);


    }
}
