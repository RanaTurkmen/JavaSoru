package javasorubankası;

public class sm02 {
    public static void main(String[] args) {
        /*
      2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.
    Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
     */

        String s1="Ali Can";
        String s2="Merve Star";
        String s3="Mark Tom";

        System.out.println(s1.replace(" ","").length()+s2.replace(" ","").length()+s3.replace(" ","").length());







    }
}
