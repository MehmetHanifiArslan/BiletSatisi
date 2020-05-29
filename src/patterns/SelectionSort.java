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
public class SelectionSort implements Strategy {

    @Override
    public String BiletSec(List<seferler> seferler) {
        int n = seferler.size(); 
  
      
        for (int i = 0; i < n-1; i++) 
        { 
          
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (seferler.get(j).getFiyat() < seferler.get(min_idx).getFiyat()) 
                    min_idx = j; 
  
            
            seferler temp = seferler.get(min_idx); 
            seferler.set(min_idx, seferler.get(i));
            seferler.set(i, temp); 
           
    
        } 
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    return "tren";
    }
    
}


