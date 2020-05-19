/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DbConnection;
import entity.kGiris;
import entity.kGiris;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class kGirisDao extends DbConnection{
    
     public void update(kGiris kg){
         String query="update kGiris set setKullaniciadi="+kg.getKullaniciadi()+",setSifre="+kg.getSifre()+
                 " where Kullaniadi=" + kg.getKullaniciadi();
        try {
            Statement st=this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
    }
    
    public List<kGiris> read(){
        List<kGiris> aList = new ArrayList<>();
        
        try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select *from kullanicigiris");
            while(rs.next()){
                kGiris k=new kGiris(rs.getLong(1), rs.getString(2));                       
                aList.add(k);    
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return aList;
    }
    
    
}
