package deneme;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        /*
     kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
       (Not : KDV tutarını 18% olarak alın)

       Tutar Giriniz : 100
       KDV Oranı : %18
       KDV Tutarı : 18.00
       KDV'li Tutar : 118.0

            */


        Scanner scan = new Scanner(System.in);

        double rate1 = 18;

        System.out.print("Bir tutar giriniz : ");
        double tutar1 = scan.nextDouble();

        double kdvliTutar1 = tutar1 * rate1 / 100 + tutar1;

        System.out.println("KDV Oran = %  " + rate1);
        System.out.println("KDV Tutarı : " + rate1);
        System.out.println("KDV'li Tutar = " + kdvliTutar1);

        Scanner scan1 =new Scanner(System.in);

        double tutar=0;
        double rate=18;

        System.out.print("Bir tutar giriniz : ");
        tutar=scan1.nextDouble();

        double kdvTutar= tutar * (rate/ 100) ;

        double kdvliTutar=tutar + kdvTutar;

        System.out.println("KDV Oran = %  " + rate);
        System.out.println("KDV Tutarı = " + kdvTutar);
        System.out.println("KDV'li Tutar = " + kdvliTutar);


    }


    }


