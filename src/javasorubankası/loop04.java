package javasorubankası;

public class loop04 {
    public static void main(String[] args) {
        /*
        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Örnek; 223878 ´ 37
         */
        String sayi="223878";
        String bos="";

        for (int i = 0; i < sayi.length(); i++) {
            if (!bos.contains(sayi.substring(i,i+1))){
                if (sayi.indexOf(sayi.substring(i,i+1))==sayi.lastIndexOf(sayi.substring(i,i+1))){
                    bos+=sayi.substring(i,i+1);
                }
            }
        }
        System.out.println(bos);

    }
}
