/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;

/**
 *
 * @author sugi
 */
public interface ControllerInterface {
    public void login(String nama, String notelp);
    public void insert(String merk, String namaMB, String nopol, int hrg);
    public void insert(String id, String nama, String nomor, String tanggal);
}
