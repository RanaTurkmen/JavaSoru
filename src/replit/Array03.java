package replit;

public class Array03 {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]

Beklenen Çıktı:

Array Sayılarının ortalaması: 7.0
         */
        
      Integer arr[]={20, 30, 25, 35, -16, 60, -100 } ;
        int counter=0;
        double avg=0;
        for (Integer w:arr) {
            counter+=w;
            avg = counter/arr.length;
        }
        System.out.println(avg);
    }
}
