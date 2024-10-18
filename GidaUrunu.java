package java_exercise.abstractM;

public class GidaUrunu extends Urun {
    private String skt;

    public GidaUrunu(String urunAdi, double temelfiyat, String skt) {
        super(urunAdi, temelfiyat);
        this.skt = skt;
    }

    public double fiyatHesapla() {
        return temelfiyat + (temelfiyat * 0.1);
    }
    public void yazdir() {
        super.yazdir();
        System.out.println("Skt: " + skt);
    }

    public String getSkt() {
        return skt;
    }

    public void setSkt(String skt) {
        this.skt = skt;
    }
}
