package praktikummodul6;

public class PC extends Komputer implements Mouse, Keyboard, Printer{

    {
        System.out.println("PC:\n");
    }

    @Override
    void hidupkan_os() {
        System.out.println("Hidupkan OS");
    }

    @Override
    void matikan_os() {
        System.out.println("Matikan OS");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik Kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Tekan Enter");
    }

    @Override
    public void cetak_data() {
       System.out.println("Cetak Data\n");
    }
}
