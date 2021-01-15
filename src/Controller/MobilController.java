/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.*;
import Model.*;
import java.util.ArrayList;

public class MobilController implements ControllerInterface {
    
    int indexLogin = 0;
    public MobilController(){
        
    }
    public MobilEntity getMobil(){
        return AllObjectModel.mobilModel.getArrMobil(indexLogin);
    }
    public MobilEntity mobilEntity(){
       return AllObjectModel.mobilModel.getArrMobil(indexLogin);
    }
    public void insertMobil(String merk, String namaMB, String nopol, int hrg){
        MobilEntity mobilEntity = new MobilEntity();
        mobilEntity.setMerk(""+merk);
        mobilEntity.setNamaMB(""+namaMB);
        mobilEntity.setNopol(""+nopol);
        mobilEntity.setHrg(+hrg);
        AllObjectModel.mobilModel.insert(mobilEntity);
    }

    public void view(){
        AllObjectModel.mobilModel.view();
    }

    @Override
    public void login(String nama, String notelp) {
        
    }

    @Override
    public void insert(String merk, String namaMB, String nopol, int hrg) {
        AllObjectModel.mobilModel.insert(new Entity.MobilEntity(merk, namaMB, nopol, hrg));
    }

    @Override
    public void insert(String id, String nama, String nomor, String tanggal) {
        
    }

}
