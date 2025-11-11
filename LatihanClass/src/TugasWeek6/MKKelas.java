
package TugasWeek6;

public class MKKelas extends MataKuliah {
    private double performance, tugas, uts, uas;

    public MKKelas(String nama, int sks, String jadwal, String dosen,
                   double performance, double tugas, double uts, double uas) {
        super(nama, sks, jadwal, dosen);
        this.performance = performance;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (0.1 * performance) + (0.2 * uts) + (0.3 * tugas) + (0.4 * uas);
    }
}
