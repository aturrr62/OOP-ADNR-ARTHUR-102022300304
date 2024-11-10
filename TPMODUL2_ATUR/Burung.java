public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void suara() {
        System.out.println(nama + " Berkicau!");
    }

    @Override
    public void infoHewan() {
        System.out.println("Nama Burung: " + nama + ", Umur: " + umur + " tahun, Warna Bulu: " + warnaBulu);
    }
}
