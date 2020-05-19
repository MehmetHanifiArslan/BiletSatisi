/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author Hanifi
 */
public class Otobus extends biletTipi {
private String tip;
    private int koltuk;
    private String blok;
    private String nereden;
    private String nereye;

    public Otobus(int koltuk, String blok, String nereden, String nereye) {
        this.koltuk = koltuk;
        this.blok = blok;
        this.nereden = nereden;
        this.nereye = nereye;

    }

    @Override
    public int getKoltuk() {
        return koltuk;
    }

    @Override
    public String getBlok() {
        return blok;
    }

    @Override
    public String getNereden() {
        return nereden;
    }

    @Override
    public String getNereye() {
        return nereye;
    }

    @Override
    public String getTip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
