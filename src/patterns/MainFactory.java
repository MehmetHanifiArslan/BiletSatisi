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
public class MainFactory {
  

    public static void main(String[] args) {
        biletTipi tren=biletTipiFactory.getTren("Tren");
        biletTipi ucak=biletTipiFactory.getUcak("Ucak");
        biletTipi otobus=biletTipiFactory.getOtobus("Otobus");

        System.out.println(tren.getTip());
        System.out.println(ucak.getTip());
        
       
    }
}

