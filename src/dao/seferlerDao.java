/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DbConnection;
import entity.seferler;
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
public class seferlerDao extends DbConnection {
    public seferler findBySeferler(int seferId){
        return null;
    }
    
      public void create(seferler s) {
        
        String query = "insert into seferler VALUES("+s.getSeferId()+",'"+s.getNereden()+"','"+s.getNereye()+"','"+s.getNezaman()+",'"+s.getKalanbilet()+"','"+s.getFiyat()+"')";
        try {           
            Statement st = this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
 
     public void update(String nereden,String nereye,String zaman){
         String query="update seferler set kalanbilet=kalanbilet-1 where nereden='"+nereden+"' and nereye='"+nereye+"' and nezaman='"+zaman+"'";        
                 try {
            Statement st=this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
    }
   
    public List<seferler> read(){
        List<seferler> aList = new ArrayList<>();
        
        try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select *from seferler");
            while(rs.next()){ 
                seferler k = new seferler(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4),rs.getInt(5), rs.getInt(6));          
                aList.add(k);              
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return aList;
    }
    
    public List<seferler> readSefer(String nereden, String nereye){
        List<seferler> aList = new ArrayList<>();
        
        try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select *from seferler where nereden='"+nereden+"' and nereye='"+nereye+"'");
            while(rs.next()){ 
                seferler k = new seferler(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4),rs.getInt(5), rs.getInt(6));          
                aList.add(k);              
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return aList;
    }

    public void delete(int sefer_id) {
          try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from seferler where seferid=" +sefer_id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
