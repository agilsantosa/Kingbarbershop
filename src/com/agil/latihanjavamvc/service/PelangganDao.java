package com.agil.latihanjavamvc.service;

import com.agil.latihanjavamvc.entity.Pelanggan;
import com.agil.latihanjavamvc.error.PelangganException;
import java.util.List;

/**
 *
 * @author agil
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws  PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
