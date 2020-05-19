/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Hanifi
 */
public class yolcular {
    private long tcNo;
    private String ad;
    private String soyad;
    private long telefon;
    private int yas;
    private Bilet bilet1 ;
    private ArrayList<kampanyalar> kampanyaliste;

    public yolcular() {
    }

    public yolcular(long tcNo, String ad, String soyad, long telefon, int yas) {
        this.tcNo = tcNo;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.yas = yas;
    }
    
    

    public yolcular(long tcNo, String ad, String soyad, long telefon, int yas, Bilet bilet1, ArrayList<kampanyalar> kampanyaliste) {
        this.tcNo = tcNo;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.yas = yas;
        this.bilet1 = bilet1;
        this.kampanyaliste = kampanyaliste;
    }

    public yolcular(long aLong, String string, String string0, long aLong0, int aInt, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Bilet getBilet1() {
        return bilet1;
    }

    public void setBilet1(Bilet bilet1) {
        this.bilet1 = bilet1;
    }

    public ArrayList<kampanyalar> getKampanyaliste() {
        return kampanyaliste;
    }

    public void setKampanyaliste(ArrayList<kampanyalar> kampanyaliste) {
        this.kampanyaliste = kampanyaliste;
    }
   
   
 
    
}
