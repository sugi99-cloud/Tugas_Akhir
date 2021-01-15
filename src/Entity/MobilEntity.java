/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class MobilEntity {
    private String merk,namaMB,nopol,mobil;
    private int hari,hrg ,byr, jumlahhari, kembali;
    public MobilEntity(){
        
    }
    public MobilEntity(String merk, String namaMB, String nopol, int hrg) {
        this.merk = merk;
        this.namaMB = namaMB;
        this.nopol = nopol;
        this.hrg = hrg;
    }

    public MobilEntity(int hari, int byr, int jumlahhari, int kembali) {
        this.hari = hari;   
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

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNamaMB() {
        return namaMB;
    }

    public void setNamaMB(String namaMB) {
        this.namaMB = namaMB;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public int getByr() {
        return byr;
    }

    public void setByr(int byr) {
        this.byr = byr;
    }

    public int getKembali() {
        return kembali;
    }

    public void setKembali(int kembali) {
        this.kembali = kembali;
    }

    public int getJumlahhari() {
        return jumlahhari;
    }

    public void setJumlahhari(int jumlahhari) {
        this.jumlahhari = jumlahhari;
    }

    public int getHrg() {
        return hrg;
    }

    public void setHrg(int hrg) {
        this.hrg = hrg;
    }

    
}
