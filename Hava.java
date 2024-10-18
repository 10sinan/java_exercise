package java_exercise.tasit;

public class Hava extends Tasit {
    public int kanatUz;

    public Hava(String model, int hiz, int kapasite, int kanatUz) {
        super(model, hiz, kapasite);
        this.kanatUz = kanatUz;
    }
    public void in(){
        System.out.println("Hava tasiti iniyor");
    }
    public void yazdir(){
        super.yazdir();
        System.out.println("Kanat Uzunlugu: " + kanatUz);
    }

}
