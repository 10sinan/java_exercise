package java_exercise.tasit;

public class Ucak extends Hava {
    public int irtifa;

    public Ucak(String model, int hiz, int kapasite, int kanatUz, int irtifa) {
        super(model, hiz, kapasite, kanatUz);
        this.irtifa = irtifa;
    }

    public void havalan(){
        System.out.println("Ucak havalanıyor");
    }
    public void yazdir(){
        super.yazdir();
        System.out.println("İrtifa: " + irtifa);
    }
}
