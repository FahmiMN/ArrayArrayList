// Nama : Muhammad Nuril Fahmi
// NPM  : 2410010068
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Basis Data", "Algoritma"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        // Menambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi",  "2301001", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Budi",  "2301002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2301003", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi",  "2301004", 60));
        kelas.tambahMahasiswa(new Mahasiswa("Eko",   "2301005", 45));

        kelas.tampilkanSemua();
        System.out.println();

        // rata-rata & jumlah lulus
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        System.out.println("Jumlah data     : " + kelas.jumlahData());
        System.out.println();

        // tambah 1 mahasiswa baru lalu tampilkan jumlah terbaru
        kelas.tambahMahasiswa(new Mahasiswa("Fani", "2301006", 70));
        System.out.println("Setelah menambah 1 mahasiswa baru:");
        System.out.println("Jumlah data terbaru: " + kelas.jumlahData());
    }
}