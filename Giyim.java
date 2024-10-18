package java_exercise.abstractM;

public class Giyim extends Urun {
    private String beden;

    public Giyim(String urunAdi, double temelfiyat, String beden) {
        super(urunAdi, temelfiyat);
        this.beden = beden;
    }
    public double fiyatHesapla() {
        return temelfiyat + (temelfiyat * 0.8);
    }
    public void yazdir() {
        super.yazdir();
        System.out.println("Beden: " + beden);
    }

    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }

    

}
