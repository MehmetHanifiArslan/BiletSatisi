/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DbConnection;
import entity.kampanyalar;
import entity.seferler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hanifi
 */
public class kampanyalarDao extends DbConnection{
   
    
    public void create(kampanyalar k) {
        
        String query = "insert into kampanyalar VALUES("+k.getKampanyaNo()+",'"+k.getBasTarih()+"','"+k.getBitTarih()+"','"+k.getBilgi()+"')";
        try {           
            Statement st = this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(kampanyalar k) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from kampanyalar where kampanyaNo=" + k.getKampanyaNo());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     public void update(kampanyalar k){
         String query="update kampanyalar set bastarih="+k.getBasTarih()+",bitTarih="+k.getBitTarih()+",bilgi="+k.getBilgi()+
                 " where kampanyaNo=" + k.getKampanyaNo();
        try {
            Statement st=this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
    }
     public List<kampanyalar> read(){
        List<kampanyalar> aList = new ArrayList<>();
        
        try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select *from kampanyalar order by kampanyaNo asc");
            while(rs.next()){
                kampanyalar k=new kampanyalar(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                        
                aList.add(k);              
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return aList;
    }
}