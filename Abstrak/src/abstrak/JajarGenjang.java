/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;

/**
 *
 * @author rona
 */
public class JajarGenjang extends BangunDatar{
    public double alas,tinggi, sisiMiring;
    
    @Override
    public void hitungLuas(){
        this.luas = alas*tinggi;
    }
    @Override 
    public void hitungKeliling(){
        this.keliling = 2*(alas + sisiMiring);
    }
}
