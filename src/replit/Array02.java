package replit;

import java.util.ArrayList;

public class Array02 {
    public static void main(String[] args) {

        /*
        Array deki sayıları tolpayan Java kodunu yazınız.

array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Beklenen Çıktı:

Array toplamı: 55
     */

        Integer arr[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter= 0;
        for (Integer w:arr) {
            counter+=w;
        }
        System.out.println(counter);
    }
}
