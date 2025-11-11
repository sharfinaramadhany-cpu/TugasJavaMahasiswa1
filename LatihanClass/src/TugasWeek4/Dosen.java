
package TugasWeek4;

public class Dosen extends Pegawai {
    public int jumSKS;
    
    public Dosen(String nama, String nip, String email, String pangkat, int jumSKS) {
        super(nama, nip, email, pangkat);
        if (jumSKS > 20){
            this.jumSKS = 20;
        }else {
            this.jumSKS = jumSKS;
        }            
    }
    
      @Override
    public double hitungGaji() {
        return gajiDasar + (jumSKS * 250000);
    }

    
}

