package java_exercise.abstractM;

public class MainAbstract {
    public static void main(String[] args) {
        ElektronikUrun e1 = new ElektronikUrun("Laptop", 3540, 15);
        e1.yazdir();

        System.out.println("------");

        Giyim g1 = new Giyim("T-shirt", 54., "xlarge");
        g1.yazdir();
        System.out.println("------");

        GidaUrunu y1 = new GidaUrunu("cips", 30, "20.07.2028");
        y1.yazdir();
    }
}
