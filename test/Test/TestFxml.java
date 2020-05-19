/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import biletsatisi.FXMLDocument2Controller;
import dao.biletDao;
import dao.tasitDao;
import entity.Bilet;
import entity.seferler;
import entity.tasit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 *
 * @author Hanifi
 */
public class TestFxml {

    public java.sql.Connection con;
    private  biletDao bDao = new biletDao();

     @Test
    public boolean biletAlindiMi(){
        int biletAlinmadanOncekiSayi = bDao.biletSayisiAl();
        tasit t = new tasit();
        t.setTasitAdi("Otobüs");
        seferler sefer = new seferler(1, "Malatya", "İstanbul",null, 5, 200);
        Bilet bilet = new Bilet();
        bilet.setPeronno(4);
        bilet.setTasit1(t);
        bilet.setSeferler1(sefer);
        bDao.create(bilet);
        int biletAlindiktanSonrakiSayi = bDao.biletSayisiAl();
        if(biletAlindiktanSonrakiSayi > biletAlinmadanOncekiSayi)
            return true;
        else
            return false;
    }
    
}