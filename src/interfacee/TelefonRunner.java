package interfacee;

public class TelefonRunner {
    public static void main(String[] args) {
        //statik kullandığımız methodu class ismi ile çağırdık
        Kamera.slowMotion();

        //defoult kullandığımız methodu child classtan oluşturduğumuz obje ile çağırdık çünkü parent interface eksik method içeriyor.
        Samsung s=new Samsung();
        s.quickTake();
        Xiaomi x=new Xiaomi();
        x.quickTake();
        //veriablelları class ismi ile çağırabiliriz
        System.out.println(Oyun.age);
        System.out.println(Oyun.oyunName);
        System.out.println(TelefonOyunu.age);







    }
}
