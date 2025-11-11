
package TugasWeek6;

public class MKSeminar extends MataKuliah {
    private double bimbingan, artikel, presentasi;

    public MKSeminar(String nama, int sks, String jadwal, String dosen,
                     double bimbingan, double artikel, double presentasi) {
        super(nama, sks, jadwal, dosen);
        this.bimbingan = bimbingan;
        this.artikel = artikel;
        this.presentasi = presentasi;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (0.2 * bimbingan) + (0.5 * artikel) + (0.3 * presentasi);
    }
}
