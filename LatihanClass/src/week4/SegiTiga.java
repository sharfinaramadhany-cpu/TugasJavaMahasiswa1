
package week4;

public class SegiTiga extends BangunDatar {
    protected int tinggi;
    protected int alas;
  
    public SegiTiga (int sisi1, int sisi2, int sisi3, int tinggi, int alas){
        super (3);
        this.alas = alas;
        this.tinggi = tinggi;
        
        Sisi [0] = sisi1;
        Sisi [1] = sisi2;
        Sisi [2] = sisi3;
        
    }
    public int luas(){
        return (alas*tinggi)/2 ;
    }
    
    
}
