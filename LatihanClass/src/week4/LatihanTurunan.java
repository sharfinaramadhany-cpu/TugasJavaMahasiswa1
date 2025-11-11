
package week4;

public class LatihanTurunan {
    public static void main(String[] args) {
       /*PersegiPanjang x = new PersegiPanjang(10,5);
       SegiTiga y = new SegiTiga(2,4,6,8,10);
       Lingkaran z = new Lingkaran (4);
        
       System.out.println("luas : " + x.luas());
       System.out.println("jumlah Sisi : " + x.jumSisi);
       System.out.println("p" + x.keliling() );
       System.out.println("jumlah segitiga: " + y.luas());
       System.out.println("luas lingkaran : " + z.luas());
       System.out.println("keliling lingkaran : " + z.keliling());*/
       
       BangunDatar [] bangunDatar = new BangunDatar [5];
       bangunDatar[0]= new PersegiPanjang(3,4);
       bangunDatar[1]= new Lingkaran(3);
       bangunDatar[2]= new PersegiPanjang(2,6);
       bangunDatar[3]= new Lingkaran(4);
       bangunDatar[4]= new PersegiPanjang(1,7);
       //tampilkan luasan dari 5 bangun datar tersebut
      for(int i = 0; i < bangunDatar.length ; i++) {
          System.out.println(bangunDatar[i].toString());
          System.out.println("luas = "+ bangunDatar[i].luas());
    
}
    }
    //tampilkan luasan dari 5 bangun datar tersebut
   
  
    
}
