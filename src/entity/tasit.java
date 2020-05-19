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
public class tasit {
    private int tasitId;
    private String tasitAdi;

    public tasit() {
    }

    public tasit(int tasitId, String tasitAdi) {
        this.tasitId = tasitId;
        this.tasitAdi = tasitAdi;
    }

    public int getTasitId() {
        return tasitId;
    }

    public void setTasitId(int tasitId) {
        this.tasitId = tasitId;
    }

    public String getTasitAdi() {
        return tasitAdi;
    }

    public void setTasitAdi(String tasitAdi) {
        this.tasitAdi = tasitAdi;
    }
    
}
