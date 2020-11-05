/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agil.latihanjavamvc.main;

import com.agil.latihanjavamvc.database.KingbarberShopDatabase;
import com.agil.latihanjavamvc.entity.Pelanggan;
import com.agil.latihanjavamvc.error.PelangganException;
import com.agil.latihanjavamvc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author agil
 */
public class LatihanJavaMVC {
    public static void main(String[] args) throws SQLException, PelangganException {
        PelangganDao dao = KingbarberShopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        
        pelanggan.setNama("bambang");
        pelanggan.setAlamat("Jl Kh Wahid Hasyim Rt 03 Rw 08");
        pelanggan.setTelepon("082135399062");
        pelanggan.setEmail("agil@gmail.com");
        
        dao.insertPelanggan(pelanggan);
    }
}
