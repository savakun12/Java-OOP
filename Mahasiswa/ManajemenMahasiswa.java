import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void tampilkanMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs);
        }
    }
}

public void hapusMahasiswa(String nim) {
    boolean ditemukan = false;
    for (Mahasiswa mhs : daftarMahasiswa) {
        if (mhs.getNim().equals(nim)) {
            daftarMahasiswa.remove(mhs);
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus. ");
            ditemukan = true;
            break;
        }
    }
    if (!ditemukan) {
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan. ");
    }
}
}

