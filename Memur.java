package java_exercise.kalıtım;

public class Memur extends Calisan {
    public String departman;
    public int  mesai;

    public Memur(int phoneNumber, String name, String eposta, String departman, int  mesai) {
        super(phoneNumber, name, eposta);// ust sınıfa dair construter ı cagir
        this.departman = departman;
        this.mesai = mesai;
    }

    public void calis() {
        System.out.println(name + " adlı memur " + departman + " departmanında çalışıyor.");
    }

}
