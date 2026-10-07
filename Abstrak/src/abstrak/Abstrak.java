/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstrak;

/**
 *
 * @author rona
 */
public class Abstrak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("SEGITIGASAMAKAKI");
        SegitigaSamaKaki stsk = new SegitigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas SegitigaSamaKaki ="+stsk.luas);
        System.out.println("Keliling SegitigaSamaKaki ="+stsk.keliling);
        System.out.println("-----------------------------");
        
        System.out.println("SEGIEMPAT");
        SegiEmpat sg = new SegiEmpat ();
        sg.panjang = 15;
        sg.lebar = 6;
        sg.hitungLuas();
        sg.hitungKeliling();
        System.out.println("Luas SegiEmpat ="+ sg.luas);
        System.out.println("Keliling SegiEmpat ="+ sg.keliling);
        System.out.println("-----------------------------");
        
        System.out.println("LINGKARAN");
        Lingkaran lg = new Lingkaran();
        lg.jariJari = 5;
        lg.hitungKeliling();
        lg.hitungLuas();
        System.out.println("Luas Lingkaran ="+lg.luas);
        System.out.println("Keliling Lingkaran ="+lg.keliling);
        System.out.println("-----------------------------");
        
        System.out.println("JAJARGENJANG");
        JajarGenjang jg = new JajarGenjang();
        jg.alas = 15;
        jg.tinggi = 8;
        jg.sisiMiring = 4;
        jg.hitungLuas();
        jg.hitungKeliling();
        System.out.println("Luas JajarGenjang ="+jg.luas);
        System.out.println("Keliling JajarGenjang ="+jg.keliling);
        System.out.println("-----------------------------");
                
        // TODO code application logic here
    }
    
}
