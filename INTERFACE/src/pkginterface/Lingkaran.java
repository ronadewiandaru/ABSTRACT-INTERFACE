/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author rona
 */
public class Lingkaran extends BangunDatar implements Resizeable {
    public int jariJari;
    
    @Override
    public void HitungLuas(){
        this.luas = Math.PI*jariJari*jariJari;
    }
    @Override
    public void HitungKeliling(){
        this.keliling = 2*Math.PI*jariJari;
    }
    @Override 
    public void perbesar(){
        this.jariJari = this.jariJari * 2;
    }
    @Override
    public void perkecil(){
        this.jariJari = (int) (0.5*this.jariJari);
    }
    
}
