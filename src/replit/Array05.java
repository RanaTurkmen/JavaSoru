package replit;

import java.util.ArrayList;

public class Array05 {
    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

Aranan Değer:2020

Beklenen Çıktı:**True**

Aranan Değer:2010

Beklenen Çıktı :**False**
```
         */
        Integer arr1[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        ArrayList<Integer> arr =new ArrayList<>();

        arr.add(1551);
        arr.add(1223);
        arr.add(1443);
        arr.add(1267);
        arr.add(1789);
        arr.add(1023);
        arr.add(2020);

        boolean r1 =arr.contains(2020);
        boolean r2 =arr.contains(2010);

        System.out.println(r1);
        System.out.println(r2);

    }
}