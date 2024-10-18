package java_exercise.kalıtım;

public class Mainkalitim {
    public static void main(String[] args) {
        Memur m1 = new Memur(
            055555555,"sihem","sihem@gmail.com","yazılım",45);
        Calisan c1 = new Calisan(
            04444444,"ipek","ipek@gmail.com");
                    
        System.out.println(m1.name + " " + m1.departman + " " + m1.phoneNumber + " " + m1.eposta);
        m1.girisYap();
        m1.calis();

        System.out.println(c1.name + " " + c1.phoneNumber + " " + c1.eposta);
        c1.girisYap();

    }
}
