package javasorubankası;

public class sm06 {
    public static void main(String[] args) {
        /*
    6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz.
     */
        String str = "Fatih hocam javayı unutmus";

        int ilk= str.charAt(0);
        int son= str.charAt(str.length()-1);
        System.out.println(ilk+son);


    }
}
