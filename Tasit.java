package java_exercise.tasit;

public class Tasit{ 
    public String model;
    public int hiz;
    public int kapasite;

    public Tasit(String model, int hiz, int kapasite) {
        this.model = model;
        this.hiz = hiz;
        this.kapasite = kapasite;
    }
    public void harketet(){
        System.out.println(model+" arac hareket etmektedir.");
    }
    public void dur(){
        System.out.println(model+" arac durduruldu.");
    }
    public void yazdir(){
        System.out.println("Tasit Bilgileri:");
        System.out.println("Model: "+model);
        System.out.println("Hiz: "+hiz+" km/h");
        System.out.println("Kapasite: "+kapasite+" adet");
    }

}
