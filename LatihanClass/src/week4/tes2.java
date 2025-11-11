/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author HP
 */
public class tes2 {
    public static void main(String[] args) {
        BangunDatar[] bangun = new BangunDatar[5];
        bangun[0] = new PersegiPanjang(3, 4);
        bangun[1] = new Lingkaran(4);
        bangun[2] = new PersegiPanjang(5, 10);
        bangun[3] = new Lingkaran(7);
        bangun[4] = new PersegiPanjang(6, 7);

        // Perulangan harus di dalam main
        for (int i = 0; i < bangun.length; i++) {
            System.out.println(bangun[i].toString());
            System.out.println("Luas     : " + bangun[i].luas());
            System.out.println("Keliling : " + bangun[i].keliling());
            System.out.println("---------------------------");
        }
    }
    }
    
}
