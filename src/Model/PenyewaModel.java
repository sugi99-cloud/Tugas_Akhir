/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.MobilEntity;
import Entity.PenyewaEntity;
import java.util.ArrayList;

public class PenyewaModel implements ModelInterfaces {
    private ArrayList<PenyewaEntity> arrPenyewa;
    
    public PenyewaModel() {
        arrPenyewa = new ArrayList<>();
    }
    public void insert(PenyewaEntity penyewaEntity){
        arrPenyewa.add(penyewaEntity);
    }
    public PenyewaEntity getArrPenyewa(int index) {
        return arrPenyewa.get(index);
    }
    @Override
    public void view() {
        for ( PenyewaEntity penyewaEntity : arrPenyewa) {
            System.out.println("==========================================");
            System.out.println("> Id Pelanggan        : " + penyewaEntity.getId());
            System.out.println("> Nama Penyewa        : " + penyewaEntity.getNama());
            System.out.println("> Nomor Telephone     : " + penyewaEntity.getNomor());
            System.out.println("> Tanggal Pinjam      : " + penyewaEntity.getTanggal());
                    }
    }

    public int cekData(String nama, String notelp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
