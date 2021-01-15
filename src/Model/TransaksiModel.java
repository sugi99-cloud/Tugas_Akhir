/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.MobilEntity;
import Entity.TransaksiEntity;
import java.util.ArrayList;

/**
 *
 * @author sugi
 */
public class TransaksiModel implements ModelInterfaces {
    private ArrayList<TransaksiEntity> ArrTransaksi;
    
    public TransaksiModel() {
        ArrTransaksi = new ArrayList<>();
    }
    public void insert(TransaksiEntity transaksiEntity){
        ArrTransaksi.add(transaksiEntity);
    }
    public TransaksiEntity getArrTransaksi(int index) {
        return ArrTransaksi.get(index);
    }

    @Override
    public void view() {
        for ( TransaksiEntity transaksi : ArrTransaksi){              
            System.out.println("> Total Pembayaran    : Rp."+transaksi.getJumlahhari());
            System.out.println("> ==========================================");
            System.out.println("> Bayar               : Rp."+transaksi.getByr());
            System.out.println("> Kembalian           : Rp."+transaksi.getKembali()+"\n");
        }
    }

    public int cekData(String nama, String notelp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
