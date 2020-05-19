/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DbConnection;
import entity.Bilet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hanifi
 */
public class biletDao extends DbConnection{
     public Bilet findByBilet(int biletNo){
        return null;
    }
    
    public void create(Bilet b) {
        
        String query = "insert into bilet VALUES("+b.getBiletno()+",'"+b.getPeronno()+"','"+b.getSeferler1()+"','"+b.getTasit1()+"')";
        try {           
            Statement st = this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(int bilet_id) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from bilet where biletNo =" +bilet_id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     public void update(Bilet b){
         String query="update bilet set peron ="+b.getPeronno()+
                 " where biletno=" + b.getBiletno();
        try {
            Statement st=this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
    }
     
     public int biletSayisiAl(){
        int biletSayisi = 0;
         try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select COUNT(*) from bilet");
             biletSayisi = rs.getInt("count");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return biletSayisi;
     }
     
     public List<Bilet> read(){
        List<Bilet> aList = new ArrayList<>();
        
        try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select * from bilet order by biletno asc");
            while(rs.next()){
                Bilet b=new Bilet(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                        
                aList.add(b);              
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return aList;
    }
}