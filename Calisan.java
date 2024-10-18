package java_exercise.kalıtım;

public class Calisan {
    public int phoneNumber;
    public String name;
    public String eposta;

    // Yapıcı (Constructor)

    public Calisan(int phoneNumber, String name, String eposta) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.eposta = eposta;
    }

    public void girisYap() {
        System.out.println(name + " isimli kişi giriş yaptı.");
    }

    public void cikisYap() {
        System.out.println(name + " isimli kişi çıkış yaptı.");
    }
}
