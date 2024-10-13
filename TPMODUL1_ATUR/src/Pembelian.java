
import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {

    static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    static ArrayList<Penumpang> daftarPenumpang = new ArrayList<>();
    static Penerbangan penerbanganTerpilih;
    static Penumpang penumpang;

    public static void main(String[] args) {
        daftarPenerbangan.add(new Penerbangan("GA505", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ911", "BDO, Bandung", "KNO, Medan", "09:00", "11:45", 1300000));
        daftarPenerbangan.add(new Penerbangan("TY789", "CGK, Jakarta", "UPG, Makassar", "07:00", "08:00", 200000));

        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("====== EAD Ticket Booking System ======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    Penerbangan.tampilkanDaftarPenerbangan(daftarPenerbangan);
                case 2:
                    beliTiket(scanner);
                case 3:
                    tampilkanPesananTiket();
                case 4:
                    System.out.println("Terima kasih!");
            }
        } while (menu != 4);
    }

    public static void beliTiket(Scanner scanner) {
        if (penumpang == null) {
            System.out.println("Silakan isi data diri Anda terlebih dahulu:");
            System.out.print("Masukkan NIK: ");
            String NIK = scanner.nextLine();
            System.out.print("Masukkan Nama Depan: ");
            String namaDepan = scanner.nextLine();
            System.out.print("Masukkan Nama Belakang: ");
            String namaBelakang = scanner.nextLine();

            penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
            daftarPenumpang.add(penumpang);

            System.out.println("Terima Kasih telah mengisi data pelanggan. Silakan pilih tiket penerbangan yang tersedia:");
        }

        Penerbangan.tampilkanDaftarPenerbangan(daftarPenerbangan);
        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        int pilihanPenerbangan = scanner.nextInt();

        penerbanganTerpilih = daftarPenerbangan.get(pilihanPenerbangan - 1);
        System.out.println("\nPemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
    }

    public static void tampilkanPesananTiket() {
        if (penumpang == null || penerbanganTerpilih == null) {
            System.out.println("\nPembelian Tiket Tidak Ada\n");
        } else {
            System.out.println("\n====== Detail Tiket Penerbangan ======");
            System.out.println("Nomor Induk Kependudukan: " + penumpang.getNIK());
            System.out.println("Nama Depan: " + penumpang.getNamaDepan());
            System.out.println("Nama Belakang: " + penumpang.getNamaBelakang());
            System.out.println("Nomor Penerbangan: " + penerbanganTerpilih.getNomorPenerbangan());
            System.out.println("Bandara Keberangkatan: " + penerbanganTerpilih.getBandaraKeberangkatan()
                    + " ---> Bandara Tujuan: " + penerbanganTerpilih.getBandaraTujuan());
            System.out.println("Waktu Keberangkatan: " + penerbanganTerpilih.getWaktuKeberangkatan()
                    + " ---> Waktu Kedatangan: " + penerbanganTerpilih.getWaktuKedatangan());
            System.out.println("Harga Tiket: Rp." + penerbanganTerpilih.getHargaTiket() + "\n");
        }
    }
}
