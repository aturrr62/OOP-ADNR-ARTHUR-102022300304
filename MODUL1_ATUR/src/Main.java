import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Inventaris ===");
            System.out.println("1. Tambah Barang Elektronik");
            System.out.println("2. Tambah Barang Non Elektronik");
            System.out.println("3. Hapus Barang");
            System.out.println("4. Tampilkan Semua Barang");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang elektronik: ");
                    String namaElektronik = scanner.nextLine();
                    System.out.print("Masukkan harga barang elektronik: ");
                    double hargaElektronik = scanner.nextDouble();
                    System.out.print("Masukkan masa garansi (bulan): ");
                    int garansi = scanner.nextInt();
                    BarangElektronik barangElektronik = new BarangElektronik(namaElektronik, hargaElektronik, garansi);
                    manajemenInventaris.tambahBarang(barangElektronik);
                    break;

                case 2:
                    System.out.print("Masukkan nama barang non-elektronik: ");
                    String namaNonElektronik = scanner.nextLine();
                    System.out.print("Masukkan harga barang non-elektronik: ");
                    double hargaNonElektronik = scanner.nextDouble();
                    scanner.nextLine();  // Konsumsi newline
                    System.out.print("Masukkan material barang: ");
                    String material = scanner.nextLine();
                    BarangNonElektronik barangNonElektronik = new BarangNonElektronik(namaNonElektronik, hargaNonElektronik, material);
                    manajemenInventaris.tambahBarang(barangNonElektronik);
                    break;

                case 3:
                    System.out.print("Masukkan nama barang yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    manajemenInventaris.hapusBarang(namaHapus);
                    break;

                case 4:
                    manajemenInventaris.tampilkanBarang();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
