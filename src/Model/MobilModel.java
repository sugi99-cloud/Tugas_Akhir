/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.MobilEntity;
import java.util.ArrayList;

public class MobilModel implements ModelInterfaces {
    private ArrayList<MobilEntity> ArrMobil;

    public MobilModel() {
        ArrMobil = new ArrayList<>();
    }
    public void insert(MobilEntity mobilEntity){
        ArrMobil.add(mobilEntity);
    }
    public MobilEntity getArrMobil(int index) {
        return ArrMobil.get(index);
    }
    @Override
    public void view() {
        for ( MobilEntity mobil : ArrMobil){                    
            System.out.println("> Merek Mobil         : "+mobil.getMerk());
            System.out.println("> Nama Mobil          : "+mobil.getNamaMB());
            System.out.println("> No.Pol              : "+mobil.getNopol());
            System.out.println("> Anda memilih mobil  : "+mobil.getNamaMB());
//            System.out.println("> Total Pembayaran    : Rp."+mobil.getJumlahhari());
//            System.out.println("> ==========================================");
//            System.out.println("> Bayar               : Rp."+mobil.getByr());
//            System.out.println("> Kembalian           : Rp."+mobil.getKembali()+"\n");
        }
    }

    public int cekData(String nama, String notelp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
