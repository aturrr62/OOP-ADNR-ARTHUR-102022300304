
import java.util.ArrayList;

public class Penerbangan {

    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    //Constructor
    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    public Penerbangan() {
    }

    //Setter
    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    //Method tampilDaftarPenerbangan
    public static void tampilkanDaftarPenerbangan(ArrayList<Penerbangan> daftarPenerbangan) {
        System.out.println("\nDaftar Penerbangan:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPenerbangan.get(i).getNomorPenerbangan()
                    + " - " + daftarPenerbangan.get(i).getBandaraKeberangkatan()
                    + " ---> " + daftarPenerbangan.get(i).getBandaraTujuan());
            System.out.println("   Waktu Keberangkatan: " + daftarPenerbangan.get(i).getWaktuKeberangkatan()
                    + " ---> Waktu Kedatangan: " + daftarPenerbangan.get(i).getWaktuKedatangan());
            System.out.println("   Harga Tiket: Rp." + daftarPenerbangan.get(i).getHargaTiket() + "\n");
        }
    }
}
