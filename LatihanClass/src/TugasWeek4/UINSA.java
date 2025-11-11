
package TugasWeek4;

import java.util.ArrayList;

public class UINSA {
    public static void main(String[] args) {
         ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

        // Tambahkan data pegawai
        daftarPegawai.add(new Dosen("Ahmad", "12345", "ahmad@uinsa.ac.id", "III", 18));
        daftarPegawai.add(new Dosen("Fatimah", "67890", "fatimah@uinsa.ac.id", "II", 22)); // lebih dari 20 sks
        daftarPegawai.add(new Staf("Budi", "54321", "budi@uinsa.ac.id", "I", 15));
        daftarPegawai.add(new Staf("Siti", "98765", "siti@uinsa.ac.id", "IV", 20));
        daftarPegawai.add(new Dosen ("che", "76543", "che@uinsa.com", "I", 11));
        daftarPegawai.add(new Dosen ("clara", "65803", "cla@uinsa.com", "II", 9));

        // Tampilkan rekap gaji semua pegawai
        System.out.println("=== Rekap Gaji Pegawai UINSA ===");
        for (Pegawai p   : daftarPegawai) {
           p.tampilkanData();
        }
    }
        
    }
   

