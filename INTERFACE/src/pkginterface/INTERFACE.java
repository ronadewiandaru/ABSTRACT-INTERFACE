/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author rona
 */
public class INTERFACE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SEGIEMPAT");
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.HitungKeliling();
        se.HitungLuas();
        System.out.println("Keliling sebelum diperbesar ="+ se.keliling);
        System.out.println("Luas sebelum diperbesar ="+ se.luas);
        se.perbesar();
        se.HitungKeliling();
        se.HitungLuas();
        System.out.println("Keliling setelah diperbesar ="+ se.keliling);
        System.out.println("Luas setelah diperbesar ="+ se.luas);
        se.perkecil();
        se.HitungKeliling();
        se.HitungLuas();
        System.out.println("Keliling setelah diperkecil ="+ se.keliling);
        System.out.println("Luas setelah diperkecil ="+ se.luas);
        System.out.println("----------------------------------------");
        
        System.out.println("SEGITIGASAMAKAKI");
        SegitigaSamaKaki sk = new SegitigaSamaKaki();
        sk.alas = 10;
        sk.tinggi = 8;
        sk.HitungKeliling();
        sk.HitungLuas();
        System.out.println("Keliling sebelum diperbesar ="+sk.keliling);
        System.out.println("Luas sebelum diperkecil ="+ sk.luas);
        sk.perbesar();
        sk.HitungKeliling();
        sk.HitungLuas();
        System.out.println("Keliling setelah diperbesar ="+ sk.keliling);
        System.out.println("Luas setelah diperbesar ="+ sk.luas);
        sk.perkecil();
        sk.HitungKeliling();
        sk.HitungLuas();
        System.out.println("Keliling setelah diperkecil ="+ sk.keliling);
        System.out.println("Luas setelah diperkecil ="+ sk.luas);
        System.out.println("----------------------------------------");
        
        System.out.println("LINGKARAN");
        Lingkaran ln = new Lingkaran ();
        ln.jariJari = 5;
        ln.HitungKeliling();
        ln.HitungLuas();
        System.out.println("Keliling sebelum diperbesar ="+ ln.keliling);
        System.out.println("Luas sebelum diperbesar ="+ ln.luas);
        ln.perbesar();
        ln.HitungKeliling();
        ln.HitungLuas();
        System.out.println("Keliling setelah diperbesar ="+ ln.keliling);
        System.out.println("Luas setelah diperbesar ="+ ln.luas);
        ln.perkecil();
        ln.HitungKeliling();
        ln.HitungLuas();
        System.out.println("Keliling setelah diperkecil ="+ ln.keliling);
        System.out.println("Luas setelah diperkecil ="+ ln.luas);
        
        // TODO code application logic here
    }
    
}
