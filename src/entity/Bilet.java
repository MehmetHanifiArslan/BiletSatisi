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
public class Bilet {
    
    private int biletno;
    private int peronno;
    private tasit tasit1;
    private seferler seferler1;

    public Bilet() {
    }

    public Bilet(int biletno, int peronno, tasit tasit1, seferler seferler1) {
        this.biletno = biletno;
        this.peronno = peronno;
        this.tasit1 = tasit1;
        this.seferler1 = seferler1;
    }

    public Bilet(int aInt, int aInt0, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBiletno() {
        return biletno;
    }

    public void setBiletno(int biletno) {
        this.biletno = biletno;
    }

    public int getPeronno() {
        return peronno;
    }

    public void setPeronno(int peronno) {
        this.peronno = peronno;
    }

    public tasit getTasit1() {
        return tasit1;
    }

    public void setTasit1(tasit tasit1) {
        this.tasit1 = tasit1;
    }

    public seferler getSeferler1() {
        return seferler1;
    }

    public void setSeferler1(seferler seferler1) {
        this.seferler1 = seferler1;
    }
    
    

}