/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import entity.seferler;
import java.util.List;

/**
 *
 * @author Hanifi
 */
public class InsertionSort implements Strategy {

    @Override
    public String BiletSec(List<seferler> seferler) {
        int n = seferler.size(); 
        for (int i = 1; i < n; ++i) { 
            int key = seferler.get(i).getFiyat();
            int j = i - 1; 
  
       
            while (j >= 0 && seferler.get(j).getFiyat() > key) { 
                seferler.set(j+1, seferler.get(j));
                j = j - 1; 
            } 
            seferler.set(j+1, seferler.get(i));
            
        } 
    return " tren";
    }
    
}
 

