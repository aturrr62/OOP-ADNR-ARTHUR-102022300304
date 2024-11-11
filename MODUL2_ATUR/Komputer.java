public class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int JumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.JumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan
    public void Informasi() {
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Jumlah Komputer: " + JumlahKomputer);
        System.out.println("Harga per Jam: Rp " + hargaPerJam);
    }
}
// (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh
// materi modul!