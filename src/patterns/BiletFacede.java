/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import dao.biletDao;
import dao.seferlerDao;
import dao.tasitDao;
import entity.Bilet;

/**
 *
 * @author Hanifi
 */
public class BiletFacede {
    private tasitDao tDao = new tasitDao();
    private seferlerDao sDao = new seferlerDao();
    private biletDao bDao = new biletDao();
    
    public void biletSil(Bilet bilet){
       
        sDao.delete(bilet.getSeferler1().getSeferId());
        tDao.delete(bilet.getTasit1().getTasitId());
        bDao.delete(bilet.getBiletno());
    
        
    }
    
    
}
