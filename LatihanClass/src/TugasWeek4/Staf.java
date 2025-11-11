
package TugasWeek4;


public class Staf extends Pegawai {
    public int jumHadir;

    public Staf(String nama, String nip, String email, String pangkat, int jumHadir) {
        super(nama, nip, email, pangkat);
        this.jumHadir = jumHadir;
    }
    
    @Override
    public double hitungGaji (){
        return gajiDasar + (jumHadir * 100_000);
    }
    
}
