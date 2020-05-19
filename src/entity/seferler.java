/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author Hanifi
 */
public class seferler {
    
        private int seferId;
        private String nereden;
        private String nereye;
        private Timestamp nezaman;
        private int kalanbilet;
        private int fiyat;

    public seferler() {
    }

    public seferler(int seferId, String nereden, String nereye, Timestamp nezaman, int kalanbilet, int fiyat) {
        this.seferId = seferId;
        this.nereden = nereden;
        this.nereye = nereye;
        this.nezaman = nezaman;
        this.kalanbilet = kalanbilet;
        this.fiyat = fiyat;
    }

 


    public int getSeferId() {
        return seferId;
    }

    public void setSeferId(int seferId) {
        this.seferId = seferId;
    }

    public String getNereden() {
        return nereden;
    }

    public void setNereden(String nereden) {
        this.nereden = nereden;
    }

    public String getNereye() {
        return nereye;
    }

    public void setNereye(String nereye) {
        this.nereye = nereye;
    }

    public Timestamp getNezaman() {
        return nezaman;
    }

    public void setNezaman(Timestamp nezaman) {
        this.nezaman = nezaman;
    }

    public int getKalanbilet() {
        return kalanbilet;
    }

    public void setKalanbilet(int kalanbilet) {
        this.kalanbilet = kalanbilet;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
        
        
        
        
        
        
}
