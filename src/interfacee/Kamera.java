package interfacee;

public interface Kamera {
    void cek();

    default void quickTake(){
        System.out.println("fotoğraf modundan çıkmadan video kaydet...");
    }

    static void slowMotion(){
        System.out.println("ağır çekim video çek...");
    }
}
