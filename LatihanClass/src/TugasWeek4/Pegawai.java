
package TugasWeek4;
public class Pegawai {
    protected String nama;
    protected String nip;
    protected String email;
    protected String pangkat;
    protected double gajiDasar = 2_000_000;
  
    public Pegawai(String nama, String nip, String email, String pangkat){
        this.nama = nama;
        this.nip = nip;
        this.email = email;
        this.pangkat = pangkat;
    
    }
    
    public double hitungGaji (){
        return gajiDasar;
    }
        public void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIP      : " + nip);
        System.out.println("Email    : " + email);
        System.out.println("Pangkat  : " + pangkat);
        System.out.println("Gaji     : Rp " + hitungGaji());
        System.out.println("--------------------------------");
    }

}
