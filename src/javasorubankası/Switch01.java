package javasorubankası;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Yazdırmak için switch ifadesini kullanınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "Bahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Güz"
e) Diğerleri için "Geçersiz ay adı"
         */

        String ay = "Mayıs";

        switch (ay) {
            case "Aralık":
            case "Ocak":
            case "Şubat":
                System.out.println("Kış");
                break;
            case "Mart":
            case "Nisan":
            case "Mayıs":
                System.out.println("Bahar");
                break;
            case "Haziran":
            case "Temmuz":
            case "Ağustos":
                System.out.println();
                break;
            case "Eylül":
            case "Ekim":
            case "Kasım":
                System.out.println();
                break;

            default:
                System.out.println("Geçersiz ay adı");

        }


    }
}
