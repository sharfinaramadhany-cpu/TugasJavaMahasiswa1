
package latihanclass;

public class Mahasiswa {
   
        String nim;
        String nama;
        String email;
        int tahunMasuk;
        
        Mahasiswa(String nim, String namaBaru, int tahunMasukBaru){
            this.nim = nim;
            nama = namaBaru;
            tahunMasuk = tahunMasukBaru;
        }
        
        void ubahEmail (String emailBaru){
            email = emailBaru;
        }
        
        int lamakuliah(int tahunSekarang){
           
            return tahunSekarang-tahunMasuk ;
        } 
  
}
