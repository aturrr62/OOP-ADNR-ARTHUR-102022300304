public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara() {
        System.out.println(nama + " Mengeong!");
    }

    @Override
    public void infoHewan() {
        System.out.println("Nama Kucing: " + nama + ", Umur: " + umur + " tahun, Ras: " + ras);
    }
}
