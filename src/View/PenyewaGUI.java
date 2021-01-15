/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.PenyewaController;
import Entity.PenyewaEntity;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sugi
 */
public class PenyewaGUI {
    private static PenyewaController penyewa = new PenyewaController();
    private static PenyewaEntity pyw = new PenyewaEntity();
    JFrame LogReg = new JFrame();
    JTable tabelpraktikan = new JTable();
    JTextArea area = new JTextArea();
    JLabel labelid,labelnama,labeljk,labeltglpinjam,labelnotelp,top;
    JTextField textid,textnama,textjk,texttglpinjam,textnotelp;
    JButton insert,next;
    
    public PenyewaGUI(){
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.GRAY);
        top = new JLabel("Rental Mobil");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(top);
        
        area.setBounds ( 270, 180, 400, 210);
        LogReg.add(area);
        
        labelid = new JLabel("Id Pelanggan");
        labelid.setBounds(50,150,100,30);
        LogReg.add(labelid);
        
        textid = new JTextField();
        textid.setBounds(50,180,200,30);
        LogReg.add(textid);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(50,210,100,30);
        LogReg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(50,240,200,30);
        LogReg.add(textnama);
        
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(50,270,100,30);
        LogReg.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(50,300,200,30);
        LogReg.add(textnotelp);
        
        labeltglpinjam = new JLabel("Tanggal Pinjam(dd-mm-yyy)");
        labeltglpinjam.setBounds(50,330,200,30);
        LogReg.add(labeltglpinjam);
        
        texttglpinjam = new JTextField();
        texttglpinjam.setBounds(50,360,200,30);
        LogReg.add(texttglpinjam);
        
        next = new JButton("Next");
        next.setBounds (50,500, 100, 30);
        next.setBackground(Color.GREEN);
        LogReg.add(next);
        next.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
                MobilGUI mbl = new MobilGUI();
            }
            
        });
        
        insert = new JButton("Insert");
        insert.setBounds(50, 400, 100, 30);
        insert.setBackground(Color.GREEN);
        LogReg.add(insert);
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        insert.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent ae){
              try{
                String id = textid.getText();
                String nama = textnama.getText();
                String nomor = textnotelp.getText();
                String tanggal = texttglpinjam.getText();
                penyewa.insertData(id,nama,nomor,tanggal);
                JOptionPane.showMessageDialog(null,"Input Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
                area.setText(datapenyewa());
            
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,"Format Penulisan Salah", "Input Gagal",JOptionPane. INFORMATION_MESSAGE);
            }
            }
        });  
    }
    String datapenyewa(){
        String text = 
        "=========PENYEWA========="+"\n\n"
        + "Id         = "+allobjctrl.penyewa.penyewaEntity().getId()+"\n"
        + "Nama       = "+allobjctrl.penyewa.penyewaEntity().getNama()+"\n"
        + "No.telp    = "+allobjctrl.penyewa.penyewaEntity().getNomor()+"\n"
        + "Tgl Pinjam = "+allobjctrl.penyewa.penyewaEntity().getTanggal()+"\n";
    return text;
    }
    public static void main(String[] args) {
        PenyewaGUI gui = new PenyewaGUI();
    } 
//    void kosong(){
//        textid.setText(null);
//        textnama.setText(null);
//        textnotelp.setText(null);
//        texttglpinjam.setText(null);
//
//    }
}

