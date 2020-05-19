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
public abstract class biletTipi {
public abstract String getTip();
    public abstract int getKoltuk();

    public abstract String getBlok();

    public abstract String getNereden();

    public abstract String getNereye();

    @Override
    public String toString() {
        return " Tip=" + this.getTip() + ","
               + " Koltuk =" + this.getKoltuk() + ","
                + " Blok=" + this.getBlok() + ","
                + "Nereden=" + this.getNereden() + ","
                + "Nereye=" + this.getNereye();
    }

}
