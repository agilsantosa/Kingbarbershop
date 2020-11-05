/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agil.latihanjavamvc.database;

import com.agil.latihanjavamvc.impl.PelangganDaoImpl;
import com.agil.latihanjavamvc.service.PelangganDao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/**
 *
 * @author agil
 */
public class KingbarberShopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/barbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = (Connection) dataSource.getConnection();
        }
        
        return connection;
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        
        return pelangganDao;
    }
}
