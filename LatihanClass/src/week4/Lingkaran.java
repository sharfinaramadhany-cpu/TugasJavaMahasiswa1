
package week4;

public class Lingkaran extends BangunDatar {
    protected double r;
    
    public Lingkaran (){
        super(1);
    }
    
    public Lingkaran (int r){
        super(1);
        this.r = r;
    }
    
    @Override
    public int luas (){
        return (int) Math.round(Math.PI *r*r);
    }
    
    @Override
    public int keliling (){
        return (int)(Math.PI*r*2);
    }
}
