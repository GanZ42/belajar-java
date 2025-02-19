package belajar;

public class kucing extends Mamalia {
    public static void main(String[] args) {
        binatang b = new binatang();
        Mamalia m = new Mamalia();
        kucing k = new kucing();

        System.out.println(m instanceof binatang);
        System.out.println(k instanceof Mamalia);
        System.out.println(k instanceof binatang);
    }
}
