/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Hanifi
 */
public class kGiris {
    private long kullaniciadi;
    private String sifre;

    public kGiris() {
    }

    public kGiris(long kullaniciadi, String sifre) {
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
    }

    public long getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(long kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
}
