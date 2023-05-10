package interfacee;

public class Samsung implements Oyun, Arama, Kamera {

    @Override
    public void basla() {
        System.out.println("sesli aramaya basla...");
    }

    @Override
    public void bitir() {
        System.out.println("sesli aramayı bitir...");

    }

    @Override
    public void cek() {
        System.out.println("fotograf cek...");
    }

    @Override
    public void oyna() {
        System.out.println("Oyna...");

    }

}
