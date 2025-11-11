
package TugasWeek6;

import java.util.*;

public class Mahasiswa {
    private String nama, nim;
    private List<MataKuliah> matkulList;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        matkulList = new ArrayList<>();
    }

    public void tambahMatkul(MataKuliah mk) {
        matkulList.add(mk);
    }

    public void tampilkanRekap() {
        System.out.println("Rekap IP " + nama + " / " + nim);
        double totalNilai = 0;
        int totalSKS = 0;
        int i = 1;

        for (MataKuliah mk : matkulList) {
            double nilaiAkhir = mk.hitungNilaiAkhir();
            String huruf = mk.getNilaiHuruf(nilaiAkhir);
            double konversi = mk.getKonversi(huruf);

            System.out.println(i + ". " + mk.nama);
            System.out.println("   Nilai Akhir : " + nilaiAkhir);
            System.out.println("   SKS         : " + mk.sks);
            System.out.println("   Nilai Abjad : " + huruf);
            System.out.println("   Nilai Konversi : " + konversi);
            System.out.println();

            totalNilai += konversi * mk.sks;
            totalSKS += mk.sks;
            i++;
        }

        double ip = totalNilai / totalSKS;
        System.out.println("IP Semester : " + String.format("%.2f", ip));
    }
}
