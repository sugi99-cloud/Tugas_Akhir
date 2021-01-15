/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.MobilEntity;
import Entity.TransaksiEntity;
import Model.*;
import java.util.ArrayList;
/**
 *
 * @author sugi
 */
public class TransaksiController implements ControllerInterface {
    int indexLogin = 0;
    public TransaksiController(){
        
    }
    public TransaksiEntity getTransaksi(){
        return AllObjectModel.transaksiModel.getArrTransaksi(indexLogin);
    }
    public TransaksiEntity transaksiEntity(){
       return AllObjectModel.transaksiModel.getArrTransaksi(indexLogin);
    }
    public void insertTransaksi(int hari, int hrg, int byr, int jumlahhari, int kembali){
        TransaksiEntity transaksiEntity = new TransaksiEntity();
        transaksiEntity.setHrg(+hrg);
        AllObjectModel.transaksiModel.insert(transaksiEntity);
    }
    public void view(){
        AllObjectModel.transaksiModel.view();
    }
    @Override
    public void login(String nama, String notelp) {
        
    }

    @Override
    public void insert(String merk, String namaMB, String nopol, int hrg) {
        AllObjectModel.transaksiModel.insert(new Entity.TransaksiEntity(hrg, hrg, hrg, hrg, hrg));
    }

    @Override
    public void insert(String id, String nama, String nomor, String tanggal) {
        
    }

}
