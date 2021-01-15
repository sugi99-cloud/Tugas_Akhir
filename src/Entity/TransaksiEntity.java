/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author sugi
 */
public class TransaksiEntity {
    private int hari,hrg ,byr, jumlahhari, kembali;
    private String merk,namaMB,nopol,mobil;
    public TransaksiEntity(){
        
    }
    public TransaksiEntity(String merk, String namaMB, String nopol, int hrg) {
        this.merk = merk;
        this.namaMB = namaMB;
        this.nopol = nopol;
        this.hrg = hrg;
    }
    public TransaksiEntity(int hari, int hrg, int byr, int jumlahhari, int kembali) {
        this.hari = hari;
        this.hrg = hrg;
        this.byr = byr;
        this.jumlahhari = jumlahhari;
        this.kembali = kembali;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHrg() {
        return hrg;
    }

    public void setHrg(int hrg) {
        this.hrg = hrg;
    }

    public int getByr() {
        return byr;
    }

    public void setByr(int byr) {
        this.byr = byr;
    }

    public int getJumlahhari() {
        return jumlahhari;
    }

    public void setJumlahhari(int jumlahhari) {
        this.jumlahhari = jumlahhari;
    }

    public int getKembali() {
        return kembali;
    }

    public void setKembali(int kembali) {
        this.kembali = kembali;
    }
    
}
