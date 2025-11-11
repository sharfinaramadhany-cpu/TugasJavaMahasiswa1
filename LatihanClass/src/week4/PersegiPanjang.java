
package week4;

public class PersegiPanjang extends BangunDatar {
    protected int panjang;
    protected int lebar;
    //protected utk akses anak"kelas
    public PersegiPanjang(int panjang, int lebar){
        super (4); //this.jumSisi = 4; //super (4); (perent)
        this.panjang = panjang;
        this.lebar = lebar;
        
        Sisi [0] = panjang;
        Sisi [1] = lebar;
        Sisi [2] = panjang;
        Sisi [3] = lebar;
       
    }

    public int luas(){
        return panjang * lebar;
    }
    
    
}
