/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Entity.PenyewaEntity;
import Model.*;
import java.util.ArrayList;

public class PenyewaController implements ControllerInterface {
    private PenyewaModel penyewa = new PenyewaModel();
    int indexLogin = 0;
    
    public PenyewaEntity getPenyewa() {
        return AllObjectModel.penyewaModel.getArrPenyewa(indexLogin);
    }
    public PenyewaEntity penyewaEntity(){
        return AllObjectModel.penyewaModel.getArrPenyewa(indexLogin);
    }
    public void insertData(String id, String nama, String nomor, String tanggal){
        PenyewaEntity penyewaEntity = new PenyewaEntity();
        penyewaEntity.setId(""+id);
        penyewaEntity.setNama(""+nama);
        penyewaEntity.setNomor(""+nomor);
        penyewaEntity.setTanggal(""+tanggal);
        AllObjectModel.penyewaModel.insert(penyewaEntity);
    }
    public void viewPenyewa(){
        AllObjectModel.penyewaModel.view();
    }
    @Override
    public void login(String nama, String notelp) {
       
    }

    @Override
    public void insert(String id, String nama, String nomor, String tanggal) {
        AllObjectModel.penyewaModel.insert(new Entity.PenyewaEntity(nama, nomor, tanggal, nama, nama, nama, id));
    }

    @Override
    public void insert(String merk, String namaMB, String nopol, int hrg) {
        
    }
}
