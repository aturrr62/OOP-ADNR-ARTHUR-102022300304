
import java.util.Scanner;

class Pengguna {

    private String nama;
    private String password; // Enkapsulasi: password hanya bisa diakses dari dalam kelas

    // Konstruktor untuk inisialisasi nama dan password
    public Pengguna(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    // Getter untuk mendapatkan nama
    public String getNama() {
        return nama;
    }

    // Metode untuk verifikasi password
    public boolean verifikasiPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // Metode untuk mengubah password
    public void gantiPassword(String passwordLama, String passwordBaru) {
        if (verifikasiPassword(passwordLama)) {
            this.password = passwordBaru;
            System.out.println("Password berhasil diganti!");
        } else {
            System.out.println("Password lama salah!");
        }
    }
}

public class SistemLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Pengguna baru dengan nama dan password
        Pengguna pengguna1 = new Pengguna("Arthur", "123456");

        // Proses login sederhana
        System.out.println("Selamat datang, " + pengguna1.getNama());
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (pengguna1.verifikasiPassword(inputPassword)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal, password salah.");
        }

        // Opsi untuk mengganti password
        System.out.print("Apakah Anda ingin mengganti password? (y/n): ");
        String pilihan = scanner.nextLine();
        if (pilihan.equals("y")) {
            System.out.print("Masukkan password lama: ");
            String passwordLama = scanner.nextLine();
            System.out.print("Masukkan password baru: ");
            String passwordBaru = scanner.nextLine();
            pengguna1.gantiPassword(passwordLama, passwordBaru);
        }

        scanner.close();
    }
}
