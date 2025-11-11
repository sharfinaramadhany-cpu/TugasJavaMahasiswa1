
package week4;

public class BangunDatar {
   
    protected int jumSudut;
    protected int jumSisi;
    protected int [] Sisi;
   // private int Luas;
   // private int keliling;
        
    BangunDatar (){
        
    }            
    
    public BangunDatar(int jumSisi){
        this.jumSisi = jumSisi;
        this.Sisi = new int [jumSisi];
    }
    
    public int luas(){
        return 0;
    }
    
     public int keliling(){
        int total = 0;
        for (int i = 0 ; i < jumSisi; i++){
        total += Sisi[i];
        }
        return total;
    }
}
