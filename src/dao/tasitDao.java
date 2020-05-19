/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DbConnection;
import entity.tasit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hanifi
 */
public class tasitDao extends DbConnection{
    public tasit findByTasit(int tasitId){
        return null;
    }
    public void create(tasit t) {
        
        String query = "insert into tasit VALUES("+t.getTasitId()+",'"+t.getTasitAdi()+"')";
        try {           
            Statement st = this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(int tasit_id) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from tasit where tasitId=" +tasit_id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     public void update(tasit t){
         String query="update tasit set tasitAdi ="+t.getTasitAdi()+
                 " where tasitId=" + t.getTasitId();
        try {
            Statement st=this.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
    }
     public List<tasit> read(){
        List<tasit> aList = new ArrayList<>();
        
        try {
            Statement st=this.connect().createStatement();
            ResultSet rs= st.executeQuery("select *from tasit order by tasitId asc");
            while(rs.next()){
                tasit t=new tasit(rs.getInt(1),  rs.getString(2));
                        
                aList.add(t);              
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }      
        return aList;
    }
}