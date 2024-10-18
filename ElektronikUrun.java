package java_exercise.abstractM;

public class ElektronikUrun extends Urun {
    private int garantiSuresi;

    public ElektronikUrun(String urunAdi, double temelFiyat, int garantiSuresi) {
        super(urunAdi, temelFiyat);
        this.garantiSuresi = garantiSuresi;
    }

    // %18 KDV ile fiyat hesaplama
    public double fiyatHesapla() {
        return temelfiyat + (temelfiyat * 0.18);
    }
    public void yazdir() {
        super.yazdir();
        System.out.println("Garanti Suresi: " + garantiSuresi + " ay");
    }

    public int getGarantiSuresi() {
        return garantiSuresi;
    }

    public void setGarantiSuresi(int garantiSuresi) {
        this.garantiSuresi = garantiSuresi;
    }
}
