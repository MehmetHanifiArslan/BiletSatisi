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
public class kampanyalar {
    private int kampanyaNo;
    private String basTarih;
    private String bitTarih;
    private String bilgi;

    public kampanyalar() {
    }

    public kampanyalar(int kampanyaNo, String basTarih, String bitTarih, String bilgi) {
        this.kampanyaNo = kampanyaNo;
        this.basTarih = basTarih;
        this.bitTarih = bitTarih;
        this.bilgi = bilgi;
    }

    public int getKampanyaNo() {
        return kampanyaNo;
    }

    public void setKampanyaNo(int kampanyaNo) {
        this.kampanyaNo = kampanyaNo;
    }

    public String getBasTarih() {
        return basTarih;
    }

    public void setBasTarih(String basTarih) {
        this.basTarih = basTarih;
    }

    public String getBitTarih() {
        return bitTarih;
    }

    public void setBitTarih(String bitTarih) {
        this.bitTarih = bitTarih;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }
    
  }
