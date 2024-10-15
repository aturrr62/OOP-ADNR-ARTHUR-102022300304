import java.util.ArrayList;

public class ManajemenInventaris {
    private ArrayList<Barang> daftarBarang;

    public ManajemenInventaris() {
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan.");
    }

    public void hapusBarang(String nama) {
        boolean ditemukan = daftarBarang.removeIf(barang -> barang.getNama().equalsIgnoreCase(nama));
        if (ditemukan) {
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public void tampilkanBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Inventaris kosong.");
        } else {
            System.out.println("\n=== Daftar Barang ===");
            for (Barang barang : daftarBarang) {
                System.out.println(barang);
            }
        }
    }
}
