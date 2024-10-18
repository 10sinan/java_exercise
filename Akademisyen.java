package java_exercise.kalıtım;

public  abstract class Akademisyen extends Calisan {
    public String bolum, ders, gorev;

    public Akademisyen(int phoneNumber, String name, String eposta, String bolum, String ders, String gorev) {
        super(phoneNumber, name, eposta);// ust sınıfa dair constructer ı cagr
        this.bolum = bolum;
        this.ders = ders;
        this.gorev = gorev;
    }

    public void derseGir() {
        System.out.println(name + " adlı akademisyen " + ders + " dersine giriyor.");
    }

}
