package java_exercise.tasit;

public class Kara extends Tasit {
    public int tekSayisi;

    public Kara(String model, int hiz, int kapasite, int tekSayisi) {
        super(model, hiz, kapasite);
        this.tekSayisi = tekSayisi;
    }

    public void parkEt() {
        System.out.println(model + " isimli kara aracı park ediliyor.");
    }
    public void yazdir(){
        super.yazdir();
        System.out.println("Tek sayısı: " + tekSayisi);
    }

}
