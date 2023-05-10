package javasorubankası;

public class sm03 {
    public static void main(String[] args) {
        /*
    3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
konsolda yazdırınız.
Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
     */

        String str =" Miami 33018!!! ";
        int sum =str.replaceAll("[^A-Za-z0-9]", "").length();
        System.out.println(sum);
        String str1= " Miami 33018!!! ";
        int sum1 =str1.replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(sum1);

    }
}
