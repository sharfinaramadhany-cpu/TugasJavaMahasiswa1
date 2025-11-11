
package TugasWeek6;

abstract class MataKuliah {
    protected String nama, jadwal, dosen;
    protected int sks;

    public MataKuliah(String nama, int sks, String jadwal, String dosen) {
        this.nama = nama;
        this.sks = sks;
        this.jadwal = jadwal;
        this.dosen = dosen;
    }

    public abstract double hitungNilaiAkhir();

    public String getNilaiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "B-";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 55) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

    public double getKonversi(String huruf) {
        switch (huruf) {
            case "A": return 4.0;
            case "A-": return 3.75;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "B-": return 2.75;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }
    
}
