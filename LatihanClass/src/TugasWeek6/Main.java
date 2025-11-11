
package TugasWeek6;

import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input profil mahasiswa
        System.out.print("Masukkan nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, nim);

        System.out.print("Jumlah mata kuliah yang diambil : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nMata kuliah " + i + ":");
            System.out.print("Jenis MK (1.Kelas, 2.Praktikum, 3.Seminar) : ");
            int jenis = sc.nextInt();
            sc.nextLine();

            System.out.print("Nama MK : ");
            String mkNama = sc.nextLine();
            System.out.print("SKS : ");
            int sks = sc.nextInt(); sc.nextLine();
            System.out.print("Jadwal : ");
            String jadwal = sc.nextLine();
            System.out.print("Dosen : ");
            String dosen = sc.nextLine();

            if (jenis == 1) {
                System.out.print("Nilai performance : ");
                double perf = sc.nextDouble();
                System.out.print("Nilai tugas : ");
                double tugas = sc.nextDouble();
                System.out.print("Nilai UTS : ");
                double uts = sc.nextDouble();
                System.out.print("Nilai UAS : ");
                double uas = sc.nextDouble();
                mhs.tambahMatkul(new MKKelas(mkNama, sks, jadwal, dosen, perf, tugas, uts, uas));
            } else if (jenis == 2) {
                System.out.print("Masukkan jumlah modul praktikum : ");
                int modul = sc.nextInt();
                List<Double> nilaiModul = new ArrayList<>();
                for (int j = 1; j <= modul; j++) {
                    System.out.print("Nilai modul " + j + " : ");
                    nilaiModul.add(sc.nextDouble());
                }
                mhs.tambahMatkul(new MKPraktikum(mkNama, sks, jadwal, dosen, nilaiModul));
            } else {
                System.out.print("Nilai pembimbingan : ");
                double bimbingan = sc.nextDouble();
                System.out.print("Nilai artikel : ");
                double artikel = sc.nextDouble();
                System.out.print("Nilai presentasi : ");
                double presentasi = sc.nextDouble();
                mhs.tambahMatkul(new MKSeminar(mkNama, sks, jadwal, dosen, bimbingan, artikel, presentasi));
            }
        }

        System.out.println();
        mhs.tampilkanRekap();
    } 
}
