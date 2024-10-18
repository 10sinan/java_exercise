package java_exercise.abstractM;

public abstract class Urun {
    public String urunAdi;
    public double temelfiyat;
    
    public Urun(String urunAdi, double temelfiyat) {
        this.urunAdi = urunAdi;
        this.temelfiyat = temelfiyat;
    }   
    public abstract double fiyatHesapla();


    public void yazdir() {
        System.out.println("Ürün Adı: " + urunAdi);
        System.out.println("Temiz Fiyat: " + temelfiyat);
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getTemelfiyat() {
        return temelfiyat;
    }

    public void setTemelfiyat(double temelfiyat) {
        this.temelfiyat = temelfiyat;
    }

   
}
