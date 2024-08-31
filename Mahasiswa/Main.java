
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();

        while (true) {
            System.out.println("\n=== Sistem Manajemen Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scanner.nextLine();
                    
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                    manajemen.tambahMahasiswa(mahasiswa);
                    break;
                case 2:
                    manajemen.tampilkanMahasiswa();
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    manajemen.hapusMahasiswa(nimHapus);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
