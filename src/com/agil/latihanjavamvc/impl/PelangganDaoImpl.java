/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agil.latihanjavamvc.impl;

import com.agil.latihanjavamvc.entity.Pelanggan;
import com.agil.latihanjavamvc.error.PelangganException;
import com.agil.latihanjavamvc.service.PelangganDao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author agil
 */
public class PelangganDaoImpl implements PelangganDao{

    private Connection connection;

    private final String insertPelanggan = "INSERT INTO PELANGGAN (NAMA, ALAMAT, TELEPON, EMAIL) VALUES(?,?,?,?)";
    
    public PelangganDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try{
            
//            connection.setAutoCommit(false);
            
            statement = (PreparedStatement) connection.prepareStatement(insertPelanggan);
            statement.setString(1, pelanggan.getNama());
            statement.setString(2, pelanggan.getAlamat());
            statement.setString(3, pelanggan.getTelepon());
            statement.setString(4, pelanggan.getEmail());
            
            statement.executeUpdate();
            
//            connection.commit();
        }catch(SQLException e){
//            try{
//                connection.rollback();
//            }catch(SQLException ex){
//                
//            }
            throw new PelangganException(e.getMessage());
        }finally{
//            try{
////                connection.setAutoCommit(true);
//            }catch(SQLException ex){
//                
//            }
            if (statement != null) {
                try{
                    statement.close();
                }catch(SQLException e){
                }                
            }
        }
    }

    @Override
    public List<Pelanggan> selectAllPelanggan() throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePelanggan(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
