
package latihanclass;

public class LatihanClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa m1 = new Mahasiswa ("09389277487", "syakila", 2024);
        m1.nama = "syakila";
        m1.nim = "09389277487";
        m1.tahunMasuk = 2024;
        m1.email = "syakilot@gmail.id";
        
        m1.ubahEmail("kilooot@gmail.com");
        System.out.println(m1.email);
        
        int lamaStudi = m1.lamakuliah(2025);
        System.out.println(lamaStudi + " tahun");
     
    }
    
}
