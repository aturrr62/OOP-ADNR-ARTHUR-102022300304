
public class BarangNonElektronik extends Barang {

    private String material;

    public BarangNonElektronik(String nama, double harga, String material) {
        super(nama, harga);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
