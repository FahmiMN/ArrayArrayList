package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftar.add(m);
    }

    public double hitungRataRata() {
        if (daftar.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftar) {
            total += m.getNilai();
        }
        return total / daftar.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa m : daftar) {
            if (m.lulus()) jumlah++;
        }
        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (int i = 0; i < daftar.size(); i++) {
            Mahasiswa m = daftar.get(i);
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + ". " + m.getNama() + " (" + m.getNpm()
                    + ") - Nilai: " + m.getNilai() + " [" + status + "]");
        }
    }

    public int jumlahData() {
        return daftar.size();
    }
}