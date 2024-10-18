package java_exercise.tasit;

public class Oto extends Kara {
    public int vites;

    public Oto(String model, int hiz, int kapasite, int tekSayisi, int vites) {
        super(model, hiz, kapasite, tekSayisi);
        this.vites = vites;
    }

    public void pedalCevir() {
        System.out.println("Pedal çevrildi.");
    }
    public void yazdir() {
        super.yazdir();
        System.out.println("Vites: " + vites);
    }
}
