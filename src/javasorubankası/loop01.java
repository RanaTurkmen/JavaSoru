package javasorubankası;

public class loop01 {
    public static void main(String[] args) {
        /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A
        A A A A A
        A A A A A
         */

        int satir= 3;
        int sutun=5;

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }


    }
}
