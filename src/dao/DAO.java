/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DbConnection;

/**
 *
 * @author Hanifi
 */
public abstract class DAO extends DbConnection{
    
    public abstract void create(Object nesne);
      public abstract void delete(Object nesne);
    public abstract void update(Object nesne);
    public abstract void read();
  
    
}
