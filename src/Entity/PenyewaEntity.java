/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sugi
 */
public class PenyewaEntity {
    private String nama,nomor,tanggal;
    private String bayar,kembalian;
    private String hari,id;
    
    public PenyewaEntity() {
    }

    public PenyewaEntity(String nama, String nomor, String tanggal, String bayar, String kembalian, String hari, String id) {
        this.nama = nama;
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.bayar = bayar;
        this.kembalian = kembalian;
        this.hari = hari;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getBayar() {
        return bayar;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }

    public String getKembalian() {
        return kembalian;
    }

    public void setKembalian(String kembalian) {
        this.kembalian = kembalian;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
