
package TugasWeek6;

import java.util.List;

public class MKPraktikum extends MataKuliah {
    private List<Double> modulNilai;

    public MKPraktikum(String nama, int sks, String jadwal, String dosen, List<Double> modulNilai) {
        super(nama, sks, jadwal, dosen);
        this.modulNilai = modulNilai;
    }

    @Override
    public double hitungNilaiAkhir() {
        double sum = 0;
        for (double n : modulNilai) sum += n;
        return sum / modulNilai.size();
    }
}