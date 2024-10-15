public class BarangElektronik extends Barang {
    private int masaGaransi;

    public BarangElektronik(String nama, double harga, int masaGaransi) {
        super(nama, harga);
        this.masaGaransi = masaGaransi;
    }

    public int getMasaGaransi() {
        return masaGaransi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Masa Garansi: " + masaGaransi + " bulan";
    }
}
