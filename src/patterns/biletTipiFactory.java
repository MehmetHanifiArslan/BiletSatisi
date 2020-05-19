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
public class biletTipiFactory {

    public static biletTipi getBiletTipi(String tip, int koltuk, String blok, String nereden, String nereye) {

        if ("Ucak".equalsIgnoreCase(tip)) {
            return new Ucak(koltuk, blok, nereden, nereye);
        } else if ("Tren".equalsIgnoreCase(tip)) {
            return new Tren(koltuk, blok, nereden, nereye);
        } else if ("Otobus".equalsIgnoreCase(tip)) {
            return new Otobus(koltuk, blok, nereden, nereye);
        }
        return null;
    }

    static biletTipi getTren(String tren) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static biletTipi getUcak(String ucak) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static biletTipi getOtobus(String otobus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
