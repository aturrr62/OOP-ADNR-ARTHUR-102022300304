
public class Main {

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Momo", 2, "Persia");
        Burung burung1 = new Burung("Rio", 1, "Biru");

        System.out.println("Detail Hewan");

        kucing1.infoHewan();
        kucing1.suara();
        kucing1.makan();
        kucing1.makan("ikan");

        System.out.println();

        burung1.infoHewan();
        burung1.suara();
        burung1.makan();
        burung1.makan("biji-bijian");
    }
}
