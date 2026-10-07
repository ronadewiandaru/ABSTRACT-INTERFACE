/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author rona
 */
public class SegiEmpat extends BangunDatar implements Resizeable{
    public int panjang, lebar;
    
    @Override
    public void HitungLuas(){
        this.luas = panjang*lebar;
    }
    @Override
    public void HitungKeliling(){
        this.keliling = (2*panjang)+2*lebar;
    }
    @Override 
    public void perbesar(){
        this.panjang = this.panjang * 2;
        this.lebar = this.lebar * 2;
    }
    @Override
    public void perkecil(){
        this.panjang = this.panjang / 2;
        this.lebar = this.lebar / 2;
    }
}
