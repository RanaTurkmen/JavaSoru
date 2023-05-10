package replit;

public class Array06 {
    public static void main(String[] args) {
        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

Aranan değer:56

Beklenen Çıktı:

56 sayısı arrayin 4. elemanı
```
         */
        Integer arr[] ={12,15,43,23,56,76,78,90,77,43};

        int sayı=56;

        for (int i = 0; i <arr.length ; i++) {
           if (arr[i]==sayı){
               System.out.println(sayı+ " sayısı arrayin " + (i+1) + ". elemanı");
           }
        }




    }
}
