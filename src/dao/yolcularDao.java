/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DbConnection;
import entity.yolcular;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hanifi
 */
public class yolcularDao extends DbConnection{
    public yolcular findByTc(int tc){
        return null;
    }
    
    public void create(yolcular a) {
        
        String query = "insert into yolcular VALUES("+a.getTcNo()+",'"+a.getAd()+"','"+a.getSoyad()+"','"+a.getTelefon()+",'"+a.getYas()+"','"+a.getBilet1()+"')";
        try {           
            Statement st = this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(yolcular a) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from yolcular where tcno=" + a.getTcNo());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     public void update(yolcular a){
         String query="update yolcular set telefon="+a.getTelefon()+
                 " where tcno="+a.getTcNo();
        try {
            Statement st=this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
    }
     public List<yolcular> read(){
        List<yolcular> aList = new ArrayList<>();
        
        try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select *from yolcular order by tcNo asc");
            while(rs.next()){
                yolcular k=new yolcular(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getLong(4), 
                        rs.getInt(5),rs.getInt(6));
                aList.add(k);              
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return aList;
    }

}